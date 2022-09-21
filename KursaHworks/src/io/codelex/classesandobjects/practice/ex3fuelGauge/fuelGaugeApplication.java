package io.codelex.classesandobjects.practice.ex3fuelGauge;

import java.util.Scanner;

public class fuelGaugeApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter starting fuel up to 70");
        FuelGauge gauge1 = new FuelGauge(input.nextInt());
        FuelGauge.fuelTankCapacity();
        System.out.println("Enter starting mileage");
        Odometer odo1 = new Odometer(input.nextInt());
        Odometer.odometerLimit();

        while (FuelGauge.getFuelTank() < 70) {
            FuelGauge.fuelUp();
        }
        System.out.println("Fuel tank:" + FuelGauge.getFuelTank());

        while (FuelGauge.getFuelTank() > 0) {
            Odometer.milageUp();
            System.out.println("Mileage :" + Odometer.getMileage());
            System.out.println("Fuel tank :" + FuelGauge.getFuelTank());
        }
    }
}
