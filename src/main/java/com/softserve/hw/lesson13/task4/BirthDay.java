package com.softserve.hw.lesson13.task4;

import java.time.LocalDate;

public class BirthDay {
    public static void checkWeek(LocalDate date) {
        System.out.printf("Day of the week: %s\n", date.getDayOfWeek());
        System.out.printf("Day of the week six months later: %s\n", date.plusMonths(6).getDayOfWeek());
        System.out.printf("Day of the week twelve months later: %s\n", date.plusYears(1).getDayOfWeek());
    }
}
