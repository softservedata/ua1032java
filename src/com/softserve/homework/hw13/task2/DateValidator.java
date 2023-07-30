package com.softserve.homework.hw13.task2;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateValidator {
    public static boolean checkIfDateIsValid(String dateString){
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");

        try {
            formatter.parse(dateString);
            return true;
        } catch (DateTimeException e) {
            return false;
        }
    }
}
