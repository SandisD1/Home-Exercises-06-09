package io.codelex.polymorphism.practice.exercise1;

public class Nissan implements Car, NOS {

    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 18;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 18;
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
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
    }

    @Override
    public String toString() {
        return "Nissan{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
