package io.codelex.classesandobjects.practice.ex7Dog;

public class DogTest {
    public static void main(String[] args) {
        Dog max = new Dog("Max", "male", "Lady", "Rocky");
        Dog rocky = new Dog("Rocky", "male", "Molly", "Sam");
        Dog sparky = new Dog("Sparky", "male");
        Dog buster = new Dog("Buster", "male", "Lady", "Sparky");
        Dog sam = new Dog("Sam", "male");
        Dog lady = new Dog("Lady", "male");
        Dog molly = new Dog("Molly", "male");
        Dog coco = new Dog("Coco", "male", "Molly", "Buster");

        System.out.println(lady);
        System.out.println(rocky);

        System.out.println(coco.fathersName());
        System.out.println(sparky.fathersName());
        System.out.println(coco.hasSameMotherAs(rocky));
        System.out.println(rocky.hasSameMotherAs(sparky));

    }
}
