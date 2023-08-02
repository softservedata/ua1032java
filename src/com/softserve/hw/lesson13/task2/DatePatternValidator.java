package com.softserve.hw.lesson13.task2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePatternValidator {
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("MM.dd.yy");
    public static boolean checkCorrectDate(String date) {
        try {
            LocalDate localDate = LocalDate.parse(date, DATE_FORMATTER);
            return true;
        } catch (DateTimeException e) {
            return false;
        }
    }
}
