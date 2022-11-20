package io.codelex.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateTimeExercise {
    public static final long DAYS_BETWEEN = 5;

    public static void main(String[] args) {
        LocalDate newYears2017 = createNewYearsEve2017();

        System.out.println(newYears2017);
        System.out.println(findNextFriday13th(newYears2017));

        LocalDate[] twoDates = getTwoLocalDates();

        System.out.println(twoDates[0]);
        System.out.println(findNextFriday13th(twoDates[0]));

        System.out.println(twoDates[1]);
        System.out.println(findNextFriday13th(twoDates[1]));
    }

    public static LocalDate createNewYearsEve2017() {
        return LocalDate.of(2017, 12, 31);
    }

    public static LocalDate[] getTwoLocalDates() {
        LocalDate[] dates = new LocalDate[2];
        dates[0] = LocalDate.now();
        dates[1] = dates[0].plusDays(DAYS_BETWEEN);
        return dates;
    }

    public static LocalDate findNextFriday13th(LocalDate from) {
//
        LocalDate nextFriday = from;

        if (nextFriday.getDayOfMonth() > 13) {
            nextFriday = nextFriday.plusMonths(1).withDayOfMonth(13);
        } else {
            nextFriday = nextFriday.withDayOfMonth(13);
        }
        while (nextFriday.getDayOfWeek() != DayOfWeek.FRIDAY) {
            nextFriday = nextFriday.plusMonths(1);
        }

        return nextFriday;
    }
}
