package io.codelex.arithmetic.practice;

public class Ex4ProductToN {
    public static void main(String[] args) {

        int lowerBound = 1;
        int upperBound = 10;
        int product = lowerBound;

        for (int number = lowerBound; number <= upperBound; ++number) {
            product *= number;
        }
        System.out.println(product);
    }
}
