package com.softserve.edu.homework.homework_13_Functional_Interfaces.task_4;

import java.time.LocalDate;

public class Birthday {
    public static void birthday_day(LocalDate birthday) {
        System.out.println("The day of the week I was born : " + birthday.getDayOfWeek());
        birthday = birthday.plusMonths(6);
        System.out.println("Day of the week after 6 months after my birth : " + birthday.getDayOfWeek());
        birthday = birthday.plusMonths(6);
        System.out.println("Day of the week after 12 months after my birth : " + birthday.getDayOfWeek());
        if (birthday.isLeapYear()) {
            System.out.println("It was a leap year");
        } else {
            System.out.println("It wasn't a leap year");
        }
    }
}
