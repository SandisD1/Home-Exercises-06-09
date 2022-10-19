package io.codelex.classesandobjects.practice.ex3fuelGauge;

public class FuelGauge {

    private int fuelTank = 0;

    public FuelGauge(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public int fuelTankCapacity() {
        if (getFuelTank() > 70) {
            System.out.println("Fuel tank full! " + (fuelTank - 70) + " liters went to waste!");
            return fuelTank = 70;
        } else {
            return fuelTank;
        }
    }

    public int getFuelTank() {
        return this.fuelTank;
    }

    public void fuelUp() {
        if (fuelTank < 70) {
            fuelTank++;
        } else {
            System.out.println("Tank full!");
        }
    }

    public void fuelDown() {
        if (fuelTank > 0) {
            --fuelTank;
        } else {
            System.out.println("Tank empty!");
        }
    }
}
