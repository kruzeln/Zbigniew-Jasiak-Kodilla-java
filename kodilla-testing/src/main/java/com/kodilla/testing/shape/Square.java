package com.kodilla.testing.shape;

public class Square implements Shape {
    private double base;

    public Square (double base){
        this.base = base;
    }

    public double getField() {
        return base * base;
    }

    public String getShapeName(){
        return "square";
    }
}
