package com.softserve.edu01.hw13.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateControl {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Please enter date in format: mm.dd.yy");
        String dateInput = scanner.nextLine();

        if (IsDateFormatTrue(dateInput)) {
            System.out.println("Date format is true");
        } else {
            System.out.println("Date format is false");
        }
    }
    public static boolean IsDateFormatTrue(String dateStr) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM.dd.yy");
        dateFormat.setLenient(false);

        try {
            Date date = dateFormat.parse(dateStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
