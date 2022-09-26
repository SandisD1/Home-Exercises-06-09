package io.codelex.loops.practice;

import java.util.Scanner;

public class Ex6FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number you wish to FizzBuzz");
        int fizzable = input.nextInt();
        StringBuilder output = new StringBuilder(" ");

        for (Integer i = 1; i <= fizzable; i++) {

            if (i % 3 == 0) {
                output.append("Fizz");
            }
            if (i % 5 == 0) {
                output.append("Buzz");
            }
            if (output.toString().equals(" ")) {
                output.append(i);
            }
            if (i % 20 == 0) {
                output.append("\n");
            }
            System.out.print(output);

            output.replace(0, output.length(), " ");

        }
    }
}
