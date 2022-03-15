package com.kodilla.testing.shape;

public class Triangle implements Shape{
    @Override
    public void getShapeName() {
        System.out.println("Triangle");
    }

    @Override
    public void getField() {
        System.out.println("(a*h)/2");
    }
}

