package com.softserve.hw.lesson13.task2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataPatern { //better name is DatePatternValidator or correct DatePattern
    //private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("MM.dd.yy");
    //it is better to use constants in the same class where they are used
    public static boolean checkCorrectDate(String date) {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            LocalDate localDate = LocalDate.parse(date, dt);
            return true;
        } catch (DateTimeException e) {
            return false;
        }
    }
}
