package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Ex8FooCorpSalaries {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the base pay in USD of a Foo Corp. employee.");
        float basePay = scan.nextFloat();
        if (basePay < 8) {
            throw new Exception("Hourly rate is too low");
        }

        System.out.println("Please enter the hours the Foo Corp. employee has worked in a week.");
        int hoursWorked = scan.nextInt();
        if (hoursWorked > 60) {
            throw new Exception("Illegal amount of hours worked!");
        }
        float totalPay;

        if (hoursWorked <= 40) {
            totalPay = Math.round((hoursWorked * basePay) * 100) / 100;
            System.out.println(totalPay);
        } else if (hoursWorked <= 60) {
            totalPay = (float) Math.round((40 * basePay + (hoursWorked - 40) * basePay * 1.5) * 100) / 100;
            System.out.println(totalPay);
        }
    }
}
