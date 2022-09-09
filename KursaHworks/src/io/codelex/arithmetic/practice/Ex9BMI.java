package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Ex9BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your weight in Kilograms");
        float weight = scan.nextFloat();
        System.out.println("Please Enter your height in Meters");
        float height = scan.nextFloat();
        float weightLBS = (float) (weight * 2.20462);
        float heightIN = (float) (height * 39.3701);
        float BMI = (float) Math.round(((weightLBS * 703) / Math.pow(heightIN, 2)) * 100) / 100;
        if (BMI < 18.5) {
            System.out.println("You appear to be underweight!");
        } else if (BMI > 25) {
            System.out.println("You appear to be Overweight!");
        } else {
            System.out.println("You appear to be of optimal weight!");
        }

    }
}
