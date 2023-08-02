package com.softserve.hw.lesson13.task3;


import java.time.Year;


public class YearIsLeap {

    public static boolean check(int yearValue) {
        Year year = Year.of(yearValue);
        return year.isLeap();
    }
}