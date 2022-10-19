package io.codelex.arrays.practice;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {
        int[] firstArr = new int[10];

        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 100);
            firstArr[i] = random;
        }
        int[] secondArr = Arrays.copyOf(firstArr, 10);
        firstArr[firstArr.length - 1] = -7;

        System.out.print("Array 1: ");
        for (int first : firstArr) {
            System.out.print(first + " ");
        }
        System.out.println();
        System.out.print("Array 2: ");
        for (int second : secondArr) {
            System.out.print(second + " ");
        }

    }
}
