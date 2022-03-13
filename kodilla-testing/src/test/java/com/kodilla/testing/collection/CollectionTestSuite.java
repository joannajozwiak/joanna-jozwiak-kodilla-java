package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("Test if List is empty")
    @Test
    void testOddNumbersExterminatorEmptyList () {
        //Given
        OddNumbersExterminator oddNumbersExterminator= new OddNumbersExterminator();
        //When
        List<Integer> list1 = new LinkedList<>();
        List <Integer> list2 = oddNumbersExterminator.exterminate(list1);
        //Then
        Assertions.assertTrue(list2.isEmpty());
    }
    @DisplayName("Test if list has only even numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {

        //Given
        OddNumbersExterminator oddNumbersExterminator= new OddNumbersExterminator();
        //When
        List<Integer> list3 = new LinkedList<>();
        list3.add (5);
        list3.add (6);
        list3.add (1099);
        list3.add (4588);
        List <Integer> list4 = oddNumbersExterminator.exterminate(list3);
        //Then
        Assertions.assertEquals(6,list4.get(0));
        Assertions.assertEquals(4588,list4.get(1));

    }


}
