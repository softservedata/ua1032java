package com.softserve.homework.hw13.task4;

import java.time.LocalDate;

public class AppBirthday {
    public static void main(String[] args) {
        LocalDate birthdayDate = LocalDate.of(2003,10,22)   ;

        BirthdayInfo.printDayOfWeek(birthdayDate);
    }
}
