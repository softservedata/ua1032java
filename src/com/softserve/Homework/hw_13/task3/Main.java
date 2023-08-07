package com.softserve.Homework.hw_13.task3;
import java.time.Year;
import java.util.Scanner;
public class Main {
    public static boolean isLeapYear(int year) {
        return Year.isLeap(year);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("Enter a year: ");
        year = scanner.nextInt();
        System.out.println(isLeapYear(year) ? "Leap year" : "Not leap year");
    }
}
