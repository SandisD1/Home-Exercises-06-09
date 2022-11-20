package io.codelex.polymorphism.practice.exercise3;

public class Personalizer {
    public static void main(String[] args) {
        Employee james = new Employee("James", "Bond", "00-00-77 London",
                102037, "If I told you, I would have to ....");
        Student jack = new Student("Jack", "Black", "12 Lucky ave.", 9873214, 4.521);
        james.display();
        jack.display();
    }
}
