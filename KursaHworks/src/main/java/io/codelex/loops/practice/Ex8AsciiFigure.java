package io.codelex.loops.practice;

import java.util.Scanner;

public class Ex8AsciiFigure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter desired height od ASCII figure:");
        int size = input.nextInt();
        final String STR_1 = "****";
        final String STR_2 = "////";
        final String STR_3 = "\\\\\\\\";

        for (int i = 0; i < size; i++) {
            System.out.print(STR_2.repeat(size - 1 - i));
            System.out.print(STR_1.repeat(2 * i));
            System.out.println(STR_3.repeat(size - 1 - i));
        }
    }
}
