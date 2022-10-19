package io.codelex.classesandobjects.practice.ex3fuelGauge;

public class Odometer {
    private int mileage = 0;
    private int consumption;

    public Odometer(int mileage) {
        this.mileage = mileage;
        consumption = 0;
    }

    public int getMileage() {
        return mileage;
    }

    public void milageUp(FuelGauge fuelGauge) {
        mileage++;
        odometerLimit();
        consumption++;
        if (consumption >= 10) {
            fuelGauge.fuelDown();
            consumption -= 10;
        }
    }

    public int odometerLimit() {
        if (mileage > 999999) {
            return mileage = mileage % 999999 - 1;
        } else {
            return mileage;
        }
    }
}
