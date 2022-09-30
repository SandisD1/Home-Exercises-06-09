package io.codelex.oop.abstractShapes;

public class Triangle extends Shape{
    private double width;
    private double height;

    public Triangle(int numSides, double width, double height) {
        super(numSides);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        double area = width*height/2;
        return Math.round(area*100d)/100d;
    }

    @Override
    public double getPerimeter() {
        double hypo = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        double per = width + height + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        return  Math.round(per*100d)/100d;
    }
}


