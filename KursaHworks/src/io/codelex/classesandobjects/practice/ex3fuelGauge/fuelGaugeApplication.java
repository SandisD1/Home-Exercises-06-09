package io.codelex.classesandobjects.practice.ex3fuelGauge;

import java.util.Scanner;

public class fuelGaugeApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter starting fuel up to 70");
        FuelGauge gauge1 = new FuelGauge(input.nextInt());
        gauge1.fuelTankCapacity();
        System.out.println("Enter starting mileage");
        Odometer odo1 = new Odometer(input.nextInt());
        odo1.odometerLimit();

        while (gauge1.getFuelTank() < 70) {
            gauge1.fuelUp();
            System.out.println("Fuel tank:" + gauge1.getFuelTank());
        }

        while (gauge1.getFuelTank() > 0) {
            odo1.milageUp(gauge1);
            System.out.println("Mileage :" + odo1.getMileage());
            System.out.println("Fuel tank :" + gauge1.getFuelTank());
        }
    }
}
