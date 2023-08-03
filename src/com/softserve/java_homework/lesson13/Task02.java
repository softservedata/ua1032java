package com.softserve.java_homework.lesson13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class Task02 {

    private final static  Pattern P = Pattern.compile("\\d{2}.\\d{2}.\\d{2}");
    private final static DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("MM.dd.yy");
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        String date1 = currentDate.toString();
        String formattedDate1 = currentDate.format(DATE_TIME_FORMATTER);
        String date2 = "12.01.2023";
        String date3 = "12.01.23";

        System.out.println("Date format " + date1 + " is valid: " + ValidateDate(date1));
        System.out.println("Date format " + formattedDate1 + " is valid: " + ValidateDate(formattedDate1));
        System.out.println("Date format " + date2 + " is valid: " + ValidateDate(date2));
        System.out.println("Date format " + date3 + " is valid: " + ValidateDate(date3));
    }

    public static boolean ValidateDate(String date) {
        return P.matcher(date).matches();
    }
}
