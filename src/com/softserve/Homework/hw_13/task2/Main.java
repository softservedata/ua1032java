package com.softserve.Homework.hw_13.task2;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class Main {
    public static boolean isValidDate(String date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
            LocalDate.parse(date, formatter);
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String message;
        System.out.print("Enter a date in the format MM.dd.yy: ");
        message = scanner.next();

        System.out.println(isValidDate(message) ? "Valid date" : "Invalid date");
    }
}