package io.codelex.classesandobjects.practice.ex9swapPoints;

public class PointApp {
    public static void main(String[] args) {

        Point p1 = new Point(5, 2);
        Point p2 = new Point(-3, 6);

        Point.swapPoints(p1, p2);

        System.out.println("(" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("(" + p2.getX() + ", " + p2.getY() + ")");
    }
}
