package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Ex8minutesIntoYearsDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of minutes to convert into years and days.");

        int minutes = scan.nextInt();
        int fullYears = minutes / 525600;
        int leftoverToDays = minutes % 525600;
        int daysOnTopOfYear = leftoverToDays / 1440;

        System.out.println("That will be " + fullYears + " years and " + daysOnTopOfYear + " days!");
    }
}
