package com.softserve.homework.hw13.task3;

import java.util.function.Predicate;

public class AppLeapYear {
    public static void main(String[] args) {
        int year = 2000;
        Predicate<Integer> isLeapYear = (y) -> y % 4 == 0 && (y % 100 != 0);

        if (isLeapYear.test(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
