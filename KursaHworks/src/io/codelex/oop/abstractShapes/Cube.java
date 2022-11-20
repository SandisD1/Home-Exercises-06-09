package io.codelex.oop.abstractShapes;

public class Cube extends Shape3D {

    private final double side;

    public Cube(int numSides, double side) {
        super(numSides);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2d) * 6d;
    }

    @Override
    public double getPerimeter() {
        return side * 12;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side, 3d);
    }
}
