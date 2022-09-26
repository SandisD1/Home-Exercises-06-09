package io.codelex.classesandobjects.practice.ex2Car;

public class Car {

    double startKilometers;
    double endKilometers;
    double liters;

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
        return calculateConsumption() > 15;
    }

    public boolean economyCar() {
        return calculateConsumption() < 5;
    }

    public void fillUp(double mileage, double liters) {
        this.endKilometers = mileage;
        this.liters = liters;
    }
}
