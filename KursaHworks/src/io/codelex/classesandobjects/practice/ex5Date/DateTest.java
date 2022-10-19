package io.codelex.classesandobjects.practice.ex5Date;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date date1 = new Date(input.nextInt(), input.nextInt(), input.nextInt());

        date1.displayDate();

        System.out.println(date1.getDate());
        System.out.println(date1.getMonth());
        System.out.println(date1.getYear());

        date1.setDate(23);
        date1.setMonth(11);
        date1.setYear(1984);

        date1.displayDate();
    }
}
