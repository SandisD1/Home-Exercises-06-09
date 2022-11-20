package io.codelex.polymorphism.practice.exercise6;

import java.util.Scanner;

public class Tiger extends Feline {

    public Tiger(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
        makeSound();
        eatFood();
        System.out.println(this);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!!");
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
            if (foodArr[0].equalsIgnoreCase("meat")) {
                fodder = new Meat(Integer.parseInt(foodArr[1]));
            } else if (foodArr[0].equalsIgnoreCase("vegetable")) {
                System.out.println("Tigers don't eat that kind of food");
                fodder = new Meat(0);
            } else {
                System.out.println("Invalid food, your tiger will be little hungry and grumpy today >:/");
                fodder = new Meat(0);
            }
            super.setFoodEaten(fodder.getQuantity());
        }
    }

    public String toString() {
        return "Tiger[" + super.getAnimalName() + ", " + super.getAnimalWeight() + ", " +
                super.getLivingRegion() + ", " + getFoodEaten() + ']';
    }
}
