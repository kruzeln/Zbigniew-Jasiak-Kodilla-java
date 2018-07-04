package com.kodilla.testing;

import com.kodilla.testing.shape.*;

public class TestingMain {
    public static void main (String[] args){

        Shape circle = new Circle(5);
        Shape triangle = new Triangle(3, 2);
        Shape square = new Square(5);

        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFig(circle);
        shapeCollector.addFig(triangle);
        shapeCollector.addFig(square);

        shapeCollector.showFig();
        System.out.println("\n");
        shapeCollector.removeFig(circle);

        shapeCollector.showFig();


    }
}
