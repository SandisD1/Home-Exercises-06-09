package io.codelex.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ex1WorkedHours {
    public static void main(String[] args) {

        LocalDate start = LocalDate.of(2017, 5, 5);;
        LocalDate end = LocalDate.of(2017, 5, 19);;
        int daysWorked = 0;

        while (start.isBefore(end)) {
            if (start.getDayOfWeek() == DayOfWeek.SATURDAY || start.getDayOfWeek() == DayOfWeek.SUNDAY) {
                start = start.plusDays(1);
            } else {
                daysWorked++;
                start = start.plusDays(1);
            }
        }

        System.out.println(daysWorked);
        System.out.println(daysWorked*8);

    }
}
