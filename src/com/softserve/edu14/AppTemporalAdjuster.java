package com.softserve.edu14;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class AppTemporalAdjuster {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2023, Month.JULY, 27);
        TemporalAdjuster firstMonInMonth = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        System.out.println(localDate.with(firstMonInMonth));
        
        TemporalAdjuster nextTue = TemporalAdjusters.next(DayOfWeek.TUESDAY);
        System.out.println(localDate.with(nextTue));
    }
}