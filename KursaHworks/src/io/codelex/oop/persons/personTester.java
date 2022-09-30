package io.codelex.oop.persons;

import java.time.LocalDate;

public class personTester {
    public static void main(String[] args) {
        String customerFirstN = "James";
        String customerLastN = "Brown";
        String customerID = "CID6442";
        Customer JamesB = new Customer(customerFirstN, customerLastN, "12333", 25, customerID, 5);
        JamesB.setPurchaseCount(10);
        System.out.println(JamesB.getInfo());

        String emplyeeFirstN = "John";
        String emplyeeLastN = "White";
        LocalDate workingFrom = LocalDate.of(2018, 5,14);
        Employee johnW = new Employee(emplyeeFirstN, emplyeeLastN, "15532", 42, "Accountant", workingFrom);
        System.out.println(johnW.getInfo());
    }
}
