package io.codelex.polymorphism.practice.exercise6;

import java.util.Scanner;

public class Cat extends Feline {
    private final String breed;

    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
        makeSound();
        eatFood();
        System.out.println(this);
    }


    @Override
    public void makeSound() {
        System.out.println("Meowwww");
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
                fodder = new Meat(Integer.parseInt(foodArr[1]));
            } else {
                System.out.println("Invalid food, your cat will be little hungry and grumpy today >:/");
                fodder = new Meat(0);
            }
            super.setFoodEaten(fodder.getQuantity());
        }

    }

    @Override
    public String toString() {
        return "Cat[" + super.getAnimalName() + ", " + breed + ", " + super.getAnimalWeight()
                + ", " + super.getLivingRegion() + ", " + getFoodEaten() + ']';
    }
}
