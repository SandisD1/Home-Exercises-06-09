package io.codelex.practice;

import java.time.LocalDate;
import java.time.Month;

public class Ex2Server {
    public static void main(String[] args) {

        LocalDate start = LocalDate.of(2022, 6, 1);

        updatesInMonth(start, 2022, 9);


    }

    public static void updatesInMonth(LocalDate serverLaunch, int yearToCheck, int monthToCheck) {
        LocalDate serverFrom = serverLaunch;
        LocalDate endOfCheck = LocalDate.of(yearToCheck, monthToCheck + 1, 1);

        while (serverFrom.isBefore(endOfCheck)) {
            serverFrom = serverFrom.plusDays(14);
            if (serverFrom.getYear() == yearToCheck && serverFrom.getMonth() == Month.of(monthToCheck)) {
                System.out.println(serverFrom);
            }
        }

    }
}
