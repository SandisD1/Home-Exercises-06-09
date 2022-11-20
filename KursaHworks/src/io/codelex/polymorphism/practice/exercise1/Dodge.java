package io.codelex.polymorphism.practice.exercise1;

public class Dodge implements Car {
    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 14;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 14;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public String toString() {
        return "Dodge{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
