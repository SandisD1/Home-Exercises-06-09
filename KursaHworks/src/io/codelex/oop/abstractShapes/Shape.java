package io.codelex.oop.abstractShapes;

public abstract class Shape {
    private final int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
