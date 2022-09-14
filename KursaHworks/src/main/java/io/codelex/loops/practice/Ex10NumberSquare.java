package io.codelex.loops.practice;

import java.util.Scanner;

public class Ex10NumberSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Min?");
        int min = input.nextInt();
        System.out.println("Max?");
        int max = input.nextInt();
        int range = max - min;
        for (int i = 0; i <= range; i++) {
            System.out.println();
            for (int j = min; j <= max; j++) {
                int printer = i + j;
                if (printer > max) {
                    printer = printer - (range + 1);
                }
                System.out.print(printer);
            }
        }
    }
}
