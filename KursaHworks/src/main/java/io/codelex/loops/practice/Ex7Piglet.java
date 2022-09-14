package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Ex7Piglet {
    public static void main(String[] args) {
        int runningScore = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Piglet!");

        Random dice = new Random();
        int roll = dice.nextInt(6) + 1;
        System.out.println("Your rolled a " + roll + "!");
        if (roll == 1) {
            System.out.println("You got 0 points.");
        } else {
            runningScore = runningScore + roll;
            while (true) {
                System.out.println("Roll again?");
                String rollAgain = input.nextLine().toLowerCase();
                if (rollAgain.equals("yes")) {
                    roll = dice.nextInt(6) + 1;
                    System.out.println("Your rolled a " + roll + "!");
                    if (roll > 1) {
                        runningScore = runningScore + roll;
                    } else {
                        System.out.println("You got 0 points.");
                        break;
                    }
                } else if (rollAgain.equals("no")) {
                    System.out.println("Your final score is :" + runningScore);
                    break;
                }
            }
        }
    }
}