package io.codelex.classesandobjects.practice.ex3fuelGauge;

public class Odometer {
    static int mileage = 0;
    static int consumption;

    public Odometer(int mileage) {
        Odometer.mileage = mileage;
        consumption = 0;
    }

    public static int getMileage() {
        return mileage;
    }

    public static void milageUp() {
        mileage++;
        odometerLimit();
        consumption++;
        if (consumption >= 10) {
            FuelGauge.fuelDown();
            consumption -= 10;
        }
    }

    public static int odometerLimit() {
        if (mileage > 999999) {
            return mileage = mileage % 999999 - 1;
        } else {
            return mileage;
        }
    }
}
