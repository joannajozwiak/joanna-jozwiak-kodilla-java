package com.kodilla.testing.shape;

public class Wheel implements Shape{
    @Override
    public void getShapeName() {
        System.out.println("Wheel");
    }

    @Override
    public void getField() {
        System.out.println("Pi*r*r");

    }
}

