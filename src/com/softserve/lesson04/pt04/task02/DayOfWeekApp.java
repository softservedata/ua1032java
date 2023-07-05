package com.softserve.lesson04.pt04.task02;

import java.util.Scanner;

public class DayOfWeekApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DayOfWeek dayOfWeek = new DayOfWeek();

        System.out.println("Enter the number of day (from 1 to 7)");
        dayOfWeek.setNumOfTheDay(scanner.nextInt());
        dayOfWeek.whatIsTheDay();

        scanner.close();
    }
}
