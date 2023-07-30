package com.softserve.homework.hw13.task4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class BirthdayInfo {
    public static void printDayOfWeek(LocalDate birthdayDate){

        DayOfWeek dayOfWeek = birthdayDate.getDayOfWeek();
        System.out.println("Day of the week for " + birthdayDate + ": " + dayOfWeek);

        // Calculate and print the day of the week after 6 months
        LocalDate after6Months = birthdayDate.plusMonths(6);
        DayOfWeek dayOfWeekAfter6Months = after6Months.getDayOfWeek();
        System.out.println("Day of the week after 6 months: " + after6Months + " -> " + dayOfWeekAfter6Months);

        // Calculate and print the day of the week after 12 months
        LocalDate after12Months = birthdayDate.plusMonths(12);
        DayOfWeek dayOfWeekAfter12Months = after12Months.getDayOfWeek();
        System.out.println("Day of the week after 12 months: " + after12Months + " -> " + dayOfWeekAfter12Months);
    }
}
