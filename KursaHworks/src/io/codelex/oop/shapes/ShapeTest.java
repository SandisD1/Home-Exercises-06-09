package io.codelex.oop.shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(4, 3, 4);
        Triangle tri = new Triangle(3, 4, 5);

        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());
        System.out.println(tri.getArea());
        System.out.println(tri.getPerimeter());

    }
}
