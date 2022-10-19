package io.codelex.classesandobjects.practice.ex2Car;

public class Car {

    private final double startKilometers;
    private double endKilometers;
    private double liters;
    private final double HOG_CONSUMPTION = 15d;
    private final double ECONOMY_CONSUMPTION = 5d;

    public Car(double startKilometers) {
        this.startKilometers = startKilometers;
        this.endKilometers = endKilometers;
        this.liters = 0;
    }

    public double calculateConsumption() {
        double consumption = liters / ((endKilometers - startKilometers) / 100);

        return Math.round(consumption * 100) / 100d;
    }

    public boolean gasHog() {
        return calculateConsumption() > HOG_CONSUMPTION;
    }

    public boolean economyCar() {
        return calculateConsumption() < ECONOMY_CONSUMPTION;
    }

    public void fillUp(double mileage, double liters) {
        this.endKilometers = mileage;
        this.liters = liters;
    }
}
