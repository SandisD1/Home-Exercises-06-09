package codelex.collections.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to check");
        int given = input.nextInt();
        System.out.println(isHappy(given));

    }

    public static String isHappy(int givenNumber) {
        String asString = String.valueOf(givenNumber);
        int sum = 0;
        List<Integer> iterated = new ArrayList<>();
        iterated.add(1);
        iterated.add(givenNumber);
        while (true) {
            for (int i = 0; i < asString.length(); i++) {
                char current = asString.charAt(i);
                int currentDigit = Character.getNumericValue(current);
                sum += Math.pow(currentDigit, 2);
            }
            if (iterated.contains(sum)) {
                break;
            } else {
                iterated.add(sum);
            }
            asString = String.valueOf(sum);
            if (sum != 1) {
                sum = 0;
            }
        }
        if (sum == 1) {
            return "Very happy number!";
        } else {
            return "not a happy number";
        }
    }
}
