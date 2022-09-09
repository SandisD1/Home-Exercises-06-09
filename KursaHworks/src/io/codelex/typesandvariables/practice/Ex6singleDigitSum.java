package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Ex6singleDigitSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter next of four single digit integers to sum.");
        byte num1 = scan.nextByte();
        byte num2 = scan.nextByte();
        byte num3 = scan.nextByte();
        byte num4 = scan.nextByte();
        int sum =  num1 + num2 + num3 + num4;
        System.out.println(sum);
    }
}
