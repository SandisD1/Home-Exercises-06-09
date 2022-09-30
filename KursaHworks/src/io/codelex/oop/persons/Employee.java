package io.codelex.oop.persons;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person {

    private String position;

    private LocalDate startedWorking;
    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public int getWorkExperience() {
        LocalDate thisYear = LocalDate.now();
        Period yearsWorked = Period.between(startedWorking, thisYear);
        return yearsWorked.getYears();
    };

    @Override
    public String getInfo() {
        return position +" " + getFirstName() + " " + getLastName() + " (" + getWorkExperience() + " years)";
    }
}
