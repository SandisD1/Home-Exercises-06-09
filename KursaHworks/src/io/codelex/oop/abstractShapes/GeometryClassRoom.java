package io.codelex.oop.abstractShapes;


public class GeometryClassRoom {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(4, 4, 3);
        Triangle tri = new Triangle(3, 6, 5);
        Hexagon hex = new Hexagon(6, 5d);
        Cube cube1 = new Cube(6, 5);
        Cone cone1 = new Cone(2, 8, 9);

        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());
        System.out.println(tri.getArea());
        System.out.println(tri.getPerimeter());
        System.out.println(hex.getArea());
        System.out.println(hex.getPerimeter());
        System.out.println(cube1.getArea());
        System.out.println(cube1.getPerimeter());
        System.out.println(cube1.calculateVolume());
        System.out.println(cone1.getPerimeter());
        System.out.println(cone1.getArea());
        System.out.println(cone1.calculateVolume());

    }
}
