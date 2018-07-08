package com.kodilla.testing.shape;
import com.kodilla.testing.*;
import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.testing.shape.ShapeCollector.*;

public class ShapeCollectorTestSuite {

        @Test
    public void testAddFig() {
            //G
            Shape circle = new Circle(5);
            Shape triangle = new Triangle(3, 2);
            Shape square = new Square(5);
            ShapeCollector shapeCollector = new ShapeCollector();
            //W
            shapeCollector.addFig(circle);
            shapeCollector.addFig(triangle);
            shapeCollector.addFig(square);
            //T

            Assert.assertEquals(3, shapeCollector.getFigures().size());
        }
            @Test

     public void testRemoveFig(){
            //G
                Shape circle = new Circle(5);
                Shape triangle = new Triangle(3, 2);
                ShapeCollector shapeCollector = new ShapeCollector();
                shapeCollector.addFig(circle);
                shapeCollector.addFig(triangle);
            //W
                shapeCollector.removeFig(circle);
            //T
                Assert.assertEquals(1, shapeCollector.getFigures().size());
            }

            @Test
    public void testGetFig(){
            //G
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(1,3);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFig(circle);
        shapeCollector.addFig(triangle);
            //W
        Shape bringFig = shapeCollector.getFig(1);
            //T
        Assert.assertEquals(triangle, bringFig);
    }


}
