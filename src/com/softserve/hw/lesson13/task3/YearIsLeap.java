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
//this is better solution
//In your method currently accepts a full date string.
// If you intend to check just a year,
// then you should adjust the method signature to accept only a year and rename the variable for clarity.


//public class YearIsLeap {
//
//    public static boolean check(int yearValue) {
//        Year year = Year.of(yearValue);
//        return year.isLeap();
//    }
//}