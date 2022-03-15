package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeCollectorTestSuite {
    private static int testCounter =0;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }
    @AfterAll
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }
    @BeforeEach
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void testAddFigure () {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square();
        // When
        shapeCollector.addFigure(shape);
        // Then
        assertEquals(1, shapeCollector.showFigures().size());
    }

    @Test
    void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square();
        // When
        shapeCollector.addFigure(shape);
        assertEquals(1, shapeCollector.showFigures().size());
        boolean result = shapeCollector.removeFigure(shape);
        // Then
        Assertions.assertTrue(result);
        assertEquals(0, shapeCollector.showFigures().size());

    }

    @Test
    void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square();
        shapeCollector.addFigure(shape);

        //When
        Shape retrievedShape;
        retrievedShape = shapeCollector.getFigure(0);

        //Then
        assertEquals(shape, retrievedShape);

    }
    @Test
    void testGetFigureNegativeIndex(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square();
        shapeCollector.addFigure(shape);

        //When
        Shape retrievedShape;
        retrievedShape = shapeCollector.getFigure (-5);

        //Then
        assertNull(retrievedShape);

    }
    @Test
    void testGetFigureIndexOutOfRange(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square();
        shapeCollector.addFigure(shape);

        //When
        Shape retrievedShape;
        retrievedShape = shapeCollector.getFigure(1);

        //Then
        assertNull (retrievedShape);

    }

    @Test
    void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square();
        shapeCollector.addFigure(shape);
        //When
        List<Shape> shapeList = new LinkedList<>();
        shapeList.add(shape);
        // Then
        assertEquals(shapeList.toString(), shapeCollector.showFigures().toString());

    }

}
