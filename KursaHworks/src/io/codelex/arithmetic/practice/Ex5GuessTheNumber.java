package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Ex5GuessTheNumber {
    public static void main(String[] args) {
        double d = Math.random() * 100;
        int randomInt = (int) d + 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");

        int guess = scan.nextInt();
        if (guess < randomInt) {
            System.out.println("Sorry, you are too low.  I was thinking of 34.");
        } else if (guess > randomInt) {
            System.out.println("Sorry, you are too high.  I was thinking of 51.");
        } else {
            System.out.println("You guessed it!  What are the odds?!?");
        }
    }
}
