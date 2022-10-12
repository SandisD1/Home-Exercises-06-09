package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Ex7numOfUpperCLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string of characters to see the number of uppercase letters in.");
        String enteredString = scan.nextLine();
        int upper = 0;
        for (int i = 0; i < enteredString.length(); i++) {
            char cha = enteredString.charAt(i);
            if (cha >= 'A' && cha <= 'Z') {
                upper++;
            }
        }
        System.out.println("That string contains " + upper + " Uppercase letters!");
    }
}
