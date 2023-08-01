package com.softserve.hw.lesson13.task3;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class YearIsLeap {
    public static boolean check(String date) {
        Year year = Year.parse(date);
        return year.isLeap();
    }
}