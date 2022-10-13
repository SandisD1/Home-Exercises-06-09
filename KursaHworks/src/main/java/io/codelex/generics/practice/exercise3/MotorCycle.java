package io.codelex.generics.practice.exercise3;

public class MotorCycle extends Transport {
    private int fuelTank;

    public MotorCycle(int wheelCount, int fuelTank) {
        super(wheelCount);
        this.fuelTank = fuelTank;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    @Override
    public String toString() {
        return "Motorcycle " +
                "fuel tank =" + fuelTank + super.toString();
    }
}
