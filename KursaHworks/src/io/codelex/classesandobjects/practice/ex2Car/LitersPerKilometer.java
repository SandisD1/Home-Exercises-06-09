package io.codelex.classesandobjects.practice.ex2Car;

import java.util.Scanner;

public class LitersPerKilometer {
    public static void main(String[] args) {
        double mileage, liters;
        Car car = getCarData();

        Scanner scan = new Scanner(System.in);

        System.out.print("fillUp, enter mileage: ");
        mileage = scan.nextDouble();

        System.out.print("fillUp, enter liters: ");
        liters = scan.nextDouble();

        car.fillUp(mileage, liters);

        System.out.println("Liters per 100 kilometers are " + car.calculateConsumption());
        System.out.println("High consumption? " + car.gasHog());
        System.out.println("Economy? " + car.economyCar());

    }

    private static Car getCarData() {
        Scanner scan = new Scanner(System.in);

        double startKilometers;

        System.out.println("Enter first reading: ");
        startKilometers = scan.nextDouble();

        return new Car(startKilometers);
    }
}

