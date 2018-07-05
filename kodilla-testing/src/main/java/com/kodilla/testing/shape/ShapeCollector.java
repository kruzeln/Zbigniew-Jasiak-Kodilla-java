package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList <Shape> figures = new ArrayList<Shape>();

    public void addFig(Shape shape) {

            figures.add(shape);
    }

    public void removeFig(Shape shape){
        figures.remove(shape);
    }

    public Shape getFig (int n){

        return figures.get(n);
    }

    public void showFig(){
        for(Shape figure: figures){
            System.out.println(figure.getShapeName() + "field: " + figure.getField());
        }

    }
}
