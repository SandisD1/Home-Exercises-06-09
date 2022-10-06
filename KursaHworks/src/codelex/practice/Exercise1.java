package codelex.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int numerator;
        int divisor;
        while (true) {
            try {
                System.out.println("Enter the numerator");
                numerator = scanner.nextInt();
                System.out.println("Enter the divisor");
                divisor = scanner.nextInt();
            } catch (InputMismatchException e) {
                String badInput = scanner.next();
                if (badInput.toLowerCase().charAt(0) == 'q') {
                    break;
                }
                System.out.println("You entered bad data");
                System.out.println("Please try again");
                continue;
            }
            try {
                System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
            } catch (ArithmeticException e) {
                System.out.println("You can't divide " + numerator + " by " + 0);
            }
        }
    }
}
