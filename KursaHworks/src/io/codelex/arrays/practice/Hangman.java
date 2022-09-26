package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
    static String[] wordDataBase = {"leviathan", "arrogance", "greetings", "earth", "saxophone"};
    static int select;
    static String word;
    static String[] wordArr;
    static int gameLength;
    static String[] gameField;
    static String[] misses;

    public static boolean gameOver = false;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;
        initiateBoard();
        gameplay();

        do {
            System.out.println("Play \"again\" or \"quit\"?");
            choice = input.nextLine();
            if (choice.equals("again")) {
                initiateBoard();
                gameplay();
            }

        } while (!choice.equals("quit"));
    }

    public static void initiateBoard() {
        gameOver = false;
        select = (int) (Math.random() * wordDataBase.length);
        word = wordDataBase[select];
        wordArr = word.split("");
        gameLength = wordArr.length;
        gameField = new String[gameLength];
        misses = new String[gameLength];

        for (int i = 0; i < gameLength; i++) {
            gameField[i] = "_";
            misses[i] = " ";
        }
    }

    public static void displayBoard() {
        System.out.println("-=".repeat(5 + gameLength / 2));
        System.out.println();
        System.out.print("Word:  ");
        for (int i = 0; i < gameLength; i++) {
            System.out.print(gameField[i]);

        }
        System.out.println();
        System.out.print("Misses:  ");

        for (int i = 0; i < gameLength; i++) {

            System.out.print(misses[i]);
        }
        System.out.println();

    }

    public static void gameplay() {
        Scanner input = new Scanner(System.in);

        while (!gameOver) {
            displayBoard();
            System.out.println("Guess:");
            String guess = input.nextLine();
            if (Arrays.asList(wordArr).contains(guess)) {
                for (int i = 0; i < gameLength; i++) {
                    if (wordArr[i].equals(guess)) {
                        gameField[i] = guess;
                    }
                }
                if (Arrays.equals(wordArr, gameField)) {
                    displayBoard();
                    System.out.println("YOU GOT IT!");
                    gameOver = true;
                }
            } else if (Arrays.asList(misses).contains(" ")) {
                for (int j = 0; j < gameLength; j++) {
                    if (misses[j].equals(" ")) {
                        misses[j] = guess;
                        break;
                    }
                }
            } else {
                gameOver = true;
                System.out.println("Your are out of guesses!");
            }
        }
    }
}
