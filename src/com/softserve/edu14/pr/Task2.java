package com.softserve.edu14.pr;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * Show a date of first Monday for current month
 */

public class Task2 {
    public static void main(String[] args) {
        LocalDate firstMonday = LocalDate.now()
                .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println(firstMonday.format(DateTimeFormatter.ofPattern("MM-Y")));
    }
}