package io.codelex.enums.practice.scissorPaperStone;

import java.util.Random;
import java.util.Scanner;

public class Showdown {
    public static void main(String[] args) throws InterruptedException {
        int numOfTrials = 0;
        float playerWon = 0f;

        float AIWon = 0f;

        Random random = new Random();
        System.out.println("Let us begin...");
        delay();
        while (true) {
            System.out.println("Scissor-Paper-Stone");
            delay();
            String yourTurn = acceptableValue();
            if (yourTurn.equals("q")) {
                break;
            }
            SciPaSto playerMove = SciPaSto.getTurnByLetter(yourTurn);
            delay();
            System.out.println("\tYou chose: " + playerMove);

            SciPaSto AITurn = SciPaSto.getTurnByInt(random.nextInt(3));
            delay();
            System.out.println("\tMy turn: " + AITurn);

            delay();
            if (playerMove == SciPaSto.SCISSOR && AITurn == SciPaSto.STONE) {
                System.out.println("\tStone breaks scissor, I won!");
                numOfTrials++;
                AIWon++;
            } else if (playerMove == SciPaSto.PAPER && AITurn == SciPaSto.SCISSOR) {
                System.out.println("\tScissor cuts paper, I won!");
                numOfTrials++;
                AIWon++;
            } else if (playerMove == SciPaSto.STONE && AITurn == SciPaSto.PAPER) {
                System.out.println("\tPaper curls around the stone, I won!");
                numOfTrials++;
                AIWon++;
            } else if (playerMove == AITurn) {
                System.out.println("\tTie!");
                numOfTrials++;
            } else {
                System.out.println("\tYou won!");
                numOfTrials++;
                playerWon++;
            }
        }

        float playerPercent = playerWon * 100 / numOfTrials;
        float AIPercent = AIWon * 100 / numOfTrials;

        delay();
        System.out.println("Number of trials: " + numOfTrials);
        System.out.printf("I won " + (int) AIWon + "(%.2f%%). You won " + (int) playerWon + "(%.2f%%).\n", AIPercent, playerPercent);
        System.out.println("Bye!");

    }

    public static String acceptableValue() {
        Scanner input = new Scanner(System.in);
        String userTyped;
        while (true) {
            System.out.print("\tYour turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
            userTyped = input.nextLine().toLowerCase();
            if (userTyped.equals("s") || userTyped.equals("t") || userTyped.equals("p") || userTyped.equals("q")) {
                break;
            } else {
                System.out.println("\tInvalid input, try again...");
            }
        }
        return userTyped;
    }

    public static void delay() throws InterruptedException {
        Thread.sleep(500);
    }

}
