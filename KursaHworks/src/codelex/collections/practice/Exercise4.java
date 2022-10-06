package codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<String> uniqueNames = new HashSet<>();
        while (true) {
            System.out.print("Enter name: ");
            String toAdd = input.nextLine();
            if (toAdd.equals("")) {
                break;
            }
            uniqueNames.add(toAdd);

        }
        System.out.print("Unique name list contains:");
        for (String name : uniqueNames) {
            System.out.print(" " + name);
        }
    }
}
