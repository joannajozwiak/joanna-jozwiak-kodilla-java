package com.kodilla.testing.shape;

public class Square implements Shape{
    @Override
    public void getShapeName() {
        System.out.println("Square");

    }

    @Override
    public void getField() {
        System.out.println("a*a");
    }
}
