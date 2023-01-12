package io.codelex.practice;

public class Exercise4 {


    public static void main(String[] args) {
        String[] argsi = {"-2.45"};

        try {
            double d = getInput(argsi[0]);
            double root = Math.sqrt(d);
            System.out.println(
                    "The square root of " + d + " is " + root);
        } catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter number as first parameter.");
        } // todo -
        catch (IllegalArgumentException e) {
            System.out.println("Result will be imaginary number.");
        }

    }

    static double getInput(String s) {
        double d = Double.parseDouble(s);
        // Throw an NonPositiveNumberException if d is less than 0
        if (d < 0) {
            throw new IllegalArgumentException("Squareroot attempted from negative number.");
        }
        return d;
    }
}
