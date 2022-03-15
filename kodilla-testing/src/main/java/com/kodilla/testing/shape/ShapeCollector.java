package com.kodilla.testing.shape;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeList = new LinkedList<>();

    public void addFigure(Shape shape){
        shapeList.add(shape);
    }
    public boolean removeFigure (Shape shape){
        boolean result = false;
        if (shapeList.contains(shape)) {
            shapeList.remove(shape);
            result = true;
        }
        return result;

    }
    public Shape getFigure (int n){
        if (n < 0 || n> shapeList.size()-1) {
            return null;
        }
        return shapeList.get(n);

    }
    public List <Shape> showFigures(){
        return shapeList;
    }

}
