package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.Circle;
import com.kodilla.patterns.factory.Rectangle;
import com.kodilla.patterns.factory.Shape;
import com.kodilla.patterns.factory.Square;

public class TaskFactory {
    public static final String SHOPPINGTASK = "ShoppingTask";
    public static final String PAINTINGTASK = "PaintingTask";
    public static final String DRIVINGTASK = "DrivingTask";

    public final Task doTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Drive", "Poznań", "car");
            case PAINTINGTASK:
                return new PaintingTask("Paint", "blue", "sky");
            case SHOPPINGTASK:
                return new ShoppingTask("Buy", "Apple", 2.50);
            default:
                return null;
        }
    }
}
