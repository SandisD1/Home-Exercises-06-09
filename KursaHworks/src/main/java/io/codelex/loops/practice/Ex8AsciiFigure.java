package io.codelex.loops.practice;

import java.util.Scanner;

public class Ex8AsciiFigure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter desired height od ASCII figure:");
        int size = input.nextInt();
        String str1 = "****";
        String str2 = "////";
        String str3 = "\\\\\\\\";

        for (int i = 0; i < size; i++) {
            System.out.print(str2.repeat(size - 1 - i));
            System.out.print(str1.repeat(2 * i));
            System.out.println(str3.repeat(size - 1 - i));
        }
    }
}
