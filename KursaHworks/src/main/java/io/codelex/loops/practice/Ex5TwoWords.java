package io.codelex.loops.practice;

import java.util.Scanner;

public class Ex5TwoWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int DOTS_LENGTH = 30;
        System.out.println("Enter first word:");
        String word1 = input.next();
        System.out.println("Enter second word:");
        String word2 = input.next();

        System.out.print(word1);
        for (int i = 0; i < DOTS_LENGTH; i++) {
            System.out.print(".");
        }
        System.out.print(word2);
    }
}
