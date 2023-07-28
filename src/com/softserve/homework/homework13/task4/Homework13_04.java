package com.softserve.homework.homework13.task4;

import java.time.LocalDate;

public class Homework13_04 {
    // TODO: Create variable LocalDate birthday and set to that variable date your birthday.
    //  Create method that take as a parameter object LocalDate and print the day of the week
    //  and what was the day of the week after 6 months and what was the day of the week after
    //  12 months.

    public static void printBirthdayInfo(LocalDate birthday) {
        System.out.println("The day of the week is " + birthday.getDayOfWeek() + " [" + birthday + "]");
        birthday = birthday.plusMonths(6);
        System.out.println("The day of the week after 6 month is " + birthday.getDayOfWeek() + " [" + birthday + "]");
        birthday = birthday.plusMonths(6);
        System.out.println("The day of the week after 12 month is " + birthday.getDayOfWeek() + " [" + birthday + "]");
    }

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2005, 5, 1);

        printBirthdayInfo(birthday);
    }
}
