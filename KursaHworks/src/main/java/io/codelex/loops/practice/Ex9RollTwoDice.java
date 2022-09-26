package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Ex9RollTwoDice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter desired sum:");
        int desiredSum = input.nextInt();
        if (desiredSum > 12 || desiredSum < 2) {
            System.out.println("Impossible!");
        } else {
            System.out.println("Desired sum:" + desiredSum);

            while (true) {
                int diceA = diceRoll();
                int diceB = diceRoll();
                int sum = diceA + diceB;
                System.out.println(diceA + " and " + diceB + " = " + sum);
                if (sum == desiredSum) {
                    break;
                }
            }
        }
    }

    public static int diceRoll() {
        Random dice = new Random();
        return dice.nextInt(6) + 1;
    }
}
