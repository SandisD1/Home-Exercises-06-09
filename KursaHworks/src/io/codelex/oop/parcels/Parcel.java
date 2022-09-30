package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    private final int xLength;
    private final int yLength;
    private final int zLength;

    private final float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        boolean dimensions = (xLength + yLength + zLength) <= 300;
        boolean eachDimension = xLength >= 30 && yLength >= 30 && zLength >= 30;
        boolean validWeight;
        if (!isExpress) {
            validWeight = weight <= 30f;
        } else {
            validWeight = weight <= 15f;
        }

        if (!dimensions) {
            System.out.println("Invalid! Package dimensions exceed limit");
            return false;
        } else if (!eachDimension) {
            System.out.println("Invalid! One of dimensions is below 30!");
            return false;
        } else if (!validWeight) {
            System.out.println("Invalid! Package too heavy!!");
            return false;
        } else {
            return true;
        }


    }
}
