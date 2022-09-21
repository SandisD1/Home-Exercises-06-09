package io.codelex.classesandobjects.practice.ex3fuelGauge;

public class FuelGauge {

    static int fuelTank = 0;

    public FuelGauge(int fuelTank) {
        FuelGauge.fuelTank = fuelTank;
    }

    public static int fuelTankCapacity() {
        if (fuelTank > 70) {
            System.out.println("Fuel tank full! " + (fuelTank - 70) + " liters went to waste!");
            return fuelTank = 70;
        } else {
            return fuelTank;
        }
    }

    public static int getFuelTank() {
        return fuelTank;
    }

    public static void fuelUp() {
        if (fuelTank < 70) {
            fuelTank++;
        } else {
            System.out.println("Tank full!");
        }
    }

    public static void fuelDown() {
        if (fuelTank > 0) {
            fuelTank--;
        } else {
            System.out.println("Tank empty!");
        }
    }

}
