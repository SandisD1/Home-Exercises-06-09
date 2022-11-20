package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    private final int xLength;
    private final int yLength;
    private final int zLength;

    private final float weight;
    private final boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        final int MAX_DIMENSIONS = 300;
        final float MAX_WEIGHT = 30f;
        final float MAX_WEIGHT_EXPRESS = 15f;

        boolean dimensions = (xLength + yLength + zLength) <= MAX_DIMENSIONS;
        boolean eachDimension = xLength >= 30 && yLength >= 30 && zLength >= 30;
        boolean validWeight;
        if (!isExpress) {
            validWeight = weight <= MAX_WEIGHT;
        } else {
            validWeight = weight <= MAX_WEIGHT_EXPRESS;
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
