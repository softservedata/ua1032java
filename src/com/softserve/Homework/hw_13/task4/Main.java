package com.softserve.Homework.hw_13.task4;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void printDaysOfWeek(LocalDate date) {
        System.out.println("Day of the week: " + date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));
        System.out.println("Day of the week after 6 months: " + date.plusMonths(6).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));
        System.out.println("Day of the week after 12 months: " + date.plusMonths(12).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));
    }
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1997, 8, 23);
        printDaysOfWeek(birthday);
    }
}

