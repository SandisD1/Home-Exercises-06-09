package io.codelex.oop.abstractShapes;

public class Cone extends Shape3D{
    private double width;
    private double height;

    public Cone(int numSides, double width, double height) {
        super(numSides);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        double heightSq = Math.pow(height, 2d);
        double radiusSq = Math.pow(width/2d, 2d);
        double hypo = Math.sqrt(heightSq + radiusSq);
        double curvedSurfaceArea = Math.PI*hypo*width/2d;
        double radius = width/2d;
        double area = curvedSurfaceArea + Math.pow(radius, 2d)*Math.PI;
        return Math.round(area*100d)/100d;
    }

    @Override
    public double getPerimeter() {
        double basePer = width*Math.PI;
        double heightSq = Math.pow(height, 2d);
        double radiusSq = Math.pow(width/2d, 2d);
        double hypo = Math.sqrt(heightSq + radiusSq);
        double per = basePer + 2d*hypo;
        return Math.round(per*100d)/100d;
    }

    @Override
    public double calculateVolume() {
        double radius = width/2d;
        double vol = Math.PI*Math.pow(radius,2d)*height/3d;
        return  Math.round(vol*100d)/100d;
    }
}
