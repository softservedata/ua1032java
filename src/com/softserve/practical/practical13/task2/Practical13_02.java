package com.softserve.practical.practical13.task2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Practical13_02 {
    // TODO: Show a date of first Monday for current month

    public static void main(String[] args) {
        LocalDate firstMondayDate = LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println("Date of first Monday for current month: " + firstMondayDate);
    }
}
