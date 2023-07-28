package com.softserve.homework.homework13.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Homework13_02 {
    // TODO: Create method to validate date according to format "mm.dd.yy"

    public static boolean validateDate(String date) {
        try {
            LocalDate createdDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("MM.dd.yyyy"));
        } catch (DateTimeParseException e){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg;

        System.out.print("Enter valid date in format \"mm.dd.yy\": ");
        msg = sc.next();

        System.out.println(validateDate(msg));
    }
}
