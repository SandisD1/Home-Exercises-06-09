package io.codelex.polymorphism.practice.exercise6;

import java.util.Scanner;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
        makeSound();
        eatFood();
        System.out.println(this);
    }

    @Override
    public void makeSound() {
        System.out.println("what does a zebra say?");
    }

    @Override
    public void eatFood() {
        Scanner foodIn = new Scanner(System.in);
        String food = foodIn.nextLine();
        if (food.equalsIgnoreCase("end")) {
            Zoo.setIsEnd(true);
        } else {
            String[] foodArr = food.toLowerCase().split(" ");
            Food fodder = null;
            if (foodArr[0].equalsIgnoreCase("vegetable")) {
                fodder = new Vegetable(Integer.parseInt(foodArr[1]));
            } else if (foodArr[0].equalsIgnoreCase("meat")) {
                System.out.println("Zebras don't eat that kind of food");
                fodder = new Vegetable(0);
            } else {
                System.out.println("Invalid food, your cat will be little hungry and grumpy today >:/");
                fodder = new Vegetable(0);
            }
            super.setFoodEaten(fodder.getQuantity());
        }

    }

    @Override
    public String toString() {
        return "Zebra[" + super.getAnimalName() + ", " + super.getAnimalWeight() + ", " +
                super.getLivingRegion() + ", " + getFoodEaten() + ']';
    }
}
