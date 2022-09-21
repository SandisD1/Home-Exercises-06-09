package io.codelex.classesandobjects.practice.ex9swapPoints;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static void swapPoints(Point point1, Point point2) {
        int x1 = point1.getX();
        int y1 = point1.getY();
        point1.setX(point2.getX());
        point1.setY(point2.getY());
        point2.setX(x1);
        point2.setY(y1);
    }
}
