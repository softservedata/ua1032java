package com.softserve.Homework_Functional_Interfaces;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Homework_task02 {
    public static boolean isValidDateFormat(String dateStr) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM.dd.yy");
        dateFormat.setLenient(false);

        try {
            dateFormat.parse(dateStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String date1 = "01.01.22";
        String date2 = "13.01.22"; // Invalid month (13)
        String date3 = "01.32.22"; // Invalid day (32)
        String date4 = "01.01.2022"; // Invalid format (yy instead of yy)

        System.out.println(date1 + " is valid: " + isValidDateFormat(date1));
        System.out.println(date2 + " is valid: " + isValidDateFormat(date2));
        System.out.println(date3 + " is valid: " + isValidDateFormat(date3));
        System.out.println(date4 + " is valid: " + isValidDateFormat(date4));
    }
}