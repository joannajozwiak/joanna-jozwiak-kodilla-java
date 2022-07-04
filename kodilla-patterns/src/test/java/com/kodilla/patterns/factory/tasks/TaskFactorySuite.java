package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.Shape;
import com.kodilla.patterns.factory.ShapeFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactorySuite {
    @Test
    void testDrivingTest() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.doTask(TaskFactory.DRIVINGTASK);
        //Then
        assertEquals(false, drivingTask.isTaskExecuted());
        assertEquals("Drive to " + "Poznań" + " by " + "car", drivingTask.executeTask());
        assertEquals(true, drivingTask.isTaskExecuted());
    }

    @Test
    void testPaintingTest() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.doTask(TaskFactory.PAINTINGTASK);
        //Then
        assertEquals(false, paintingTask.isTaskExecuted());
        assertEquals("Paint " + "sky"+ " using " + "blue", paintingTask.executeTask());
        assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    void testShoppingTest() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.doTask(TaskFactory.SHOPPINGTASK);
        //Then
        assertEquals(false, shoppingTask.isTaskExecuted());
        assertEquals("Buy " + 2.5 + " of " + "Apple", shoppingTask.executeTask());
        assertEquals(true, shoppingTask.isTaskExecuted());
    }
}

