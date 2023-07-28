package com.softserve.practical.practical13.task1;

import java.time.LocalDate;

public class Practical13_01 {
    // TODO: Show which today is a day of a week

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        System.out.println("Today is " + date.getDayOfWeek());
    }
}
