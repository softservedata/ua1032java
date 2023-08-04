package com.softserve.Homework_Functional_Interfaces;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
public class Homework_task04 {
    public static void printDayOfWeek(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        System.out.println("Birthday: " + date.format(formatter));

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Day of the week: " + dayOfWeek);

        LocalDate after6Months = date.plusMonths(6);
        System.out.println("After 6 months: " + after6Months.format(formatter) + ", Day of the week: " + after6Months.getDayOfWeek());

        LocalDate after12Months = date.plusMonths(12);
        System.out.println("After 12 months: " + after12Months.format(formatter) + ", Day of the week: " + after12Months.getDayOfWeek());
    }

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2023, 8, 3); // Replace with your actual birthday
        printDayOfWeek(birthday);
    }
}