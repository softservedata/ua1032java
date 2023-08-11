package com.softserve.java_homework.lesson13;

import java.time.LocalDate;

public class Task03 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        int year1 = 2020;
        int year2 = 2022;

        System.out.println("Year " + currentDate.getYear() + " is leap: " + isLeapYear(currentDate.getYear()));
        System.out.println("Year " + year1 + " is leap: " + isLeapYear(year1));
        System.out.println("Year " + year2 + " is leap: " + isLeapYear(year2));
    }
//тут можна було одразу зробити return
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }
}
