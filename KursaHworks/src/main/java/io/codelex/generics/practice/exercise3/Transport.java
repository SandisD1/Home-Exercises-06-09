package io.codelex.generics.practice.exercise3;

public abstract class Transport {
    private int wheelCount;

    public Transport(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    @Override
    public String toString() {
        return " Wheel count = " + wheelCount;
    }
}
