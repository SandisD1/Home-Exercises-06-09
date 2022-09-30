package io.codelex.oop.abstractShapes;

public abstract class Shape {
    private int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
