package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Ex9Speed {
    public static void main(String[] args) {

        int distanceMeters = -1;
        int timeHours = -1;
        int timeMinutes = -1;
        int timeSeconds = -1;

        Scanner scan = new Scanner(System.in);

        while (distanceMeters <= -1) {
            System.out.println("Please enter the distance you have run in meters.");
            distanceMeters = scan.nextInt();
        }

        while (timeHours <= -1) {
            System.out.println("Please enter the full hours from your time.");
            timeHours = scan.nextInt();
        }

        while (timeMinutes <= -1 || timeMinutes >= 60) {
            System.out.println("Please enter the full minutes from your time.");
            timeMinutes = scan.nextInt();
        }

        while (timeSeconds <= -1 || timeSeconds >= 60) {
            System.out.println("Please enter the seconds from your time.");
            timeSeconds = scan.nextInt();
        }

        float fullTimeHours = timeHours + (float) timeMinutes / 60 + (float) timeSeconds / 3600;
        int fullTimeSeconds = (timeHours * 3600) + (timeMinutes * 60) + timeSeconds;
        float speedMS = (float) distanceMeters / fullTimeSeconds;
        float speedKMH = (float) distanceMeters / 1000 / fullTimeHours;
        float speedMPH = (float) distanceMeters / 1609 / fullTimeHours;

        System.out.println("Need for speed:");
        System.out.println("Your speed in meters per second is " + speedMS);
        System.out.println("Your speed in kilometers per hour is " + speedKMH);
        System.out.println("Your speed in miles per hour " + speedMPH);

    }
}
