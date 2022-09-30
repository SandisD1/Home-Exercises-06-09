package io.codelex.oop.abstractShapes;

import io.codelex.oop.shapes.Shape;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(int numSides, double width, double height) {
        super(numSides);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return (width+height)*2;
    }
}
