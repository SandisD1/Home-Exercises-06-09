package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static List<Animal> animalList = new ArrayList<>();

    private static boolean isEnd = false;

    public static void main(String[] args) {

        while (!isEnd) {
            readAnimal();
        }

        for (int i = 0; i < animalList.size(); i++) {
            if (i == animalList.size() - 1) {
                System.out.println(animalList.get(i));
            } else {
                System.out.print(animalList.get(i) + ", ");
            }

        }


    }

    //foodArr[0].equals("vegetable") ? Integer.parseInt(foodArr[1]) : 0
    public static void readAnimal() {
        Scanner input = new Scanner(System.in);
        String defineAnimal = input.nextLine();
        String[] definedArr = defineAnimal.split(" ");
        if (defineAnimal.equalsIgnoreCase("end")) {
            Zoo.setIsEnd(true);
        }
        if (definedArr[0].equalsIgnoreCase("mouse")) {
            animalList.add(new Mouse(definedArr[1], definedArr[0],
                    Double.parseDouble(definedArr[2]), definedArr[3]));
        } else if (definedArr[0].equalsIgnoreCase("zebra")) {
            animalList.add(new Zebra(definedArr[1], definedArr[0],
                    Double.parseDouble(definedArr[2]), definedArr[3]));
        } else if (definedArr[0].equalsIgnoreCase("cat")) {
            animalList.add(new Cat(definedArr[1], definedArr[0],
                    Double.parseDouble(definedArr[2]), definedArr[3], definedArr[4]));
        } else if (definedArr[0].equalsIgnoreCase("tiger")) {
            animalList.add(new Tiger(definedArr[1], definedArr[0],
                    Double.parseDouble(definedArr[2]), definedArr[3]));
        } else {
            System.out.println("I've never heard of such an animal");
            System.out.println("Perhaps try again?");
        }
    }

    public static void setIsEnd(boolean isEnd) {
        Zoo.isEnd = isEnd;
    }
}
