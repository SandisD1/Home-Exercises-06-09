package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Ex1Fifteen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();

        boolean result = first == 15 || second == 15 || first + second == 15 || first - second == 15;
        System.out.println(result);
    }
}
