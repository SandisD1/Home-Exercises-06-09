package io.codelex.practice.ex3DatePeriod;

import java.time.LocalDate;

public class intersectTest {

    public static void main(String[] args) {

        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 1, 10);
        LocalDate secondEnd = LocalDate.of(2022, 1, 25);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        DatePeriod overlap = firstPeriod.intersection(secondPeriod);
        DatePeriod overlap2 = secondPeriod.intersection(firstPeriod);

        System.out.println(overlap);
        System.out.println(overlap2);
    }
}
