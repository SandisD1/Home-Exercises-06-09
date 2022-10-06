package io.codelex.oop.abstractShapes;

public class Hexagon extends Shape {
    private final double side;


    public Hexagon(int numSides, double side) {
        super(numSides);
        this.side = side;
    }

    @Override
    public double getArea() {
        double area = 3d * Math.sqrt(3d) * Math.pow(side, 2d) / 2d;
        return Math.round(area * 100d) / 100d;
    }

    @Override
    public double getPerimeter() {
        return side * 6;
    }
}
