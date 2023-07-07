package com.softserve.java_practical.lesson03;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = getDayOfTheWeek(scanner);
        scanner.close();

        System.out.println("Result: " + day);
    }

    public static String getDayOfTheWeek(Scanner scanner) {
        System.out.print("Enter a number of the day of the week: ");
        int numberOfDay = scanner.nextInt();
        switch (numberOfDay) {
            case 1 -> {
                return "Monday";
            }
            case 2 -> {
                return "Tuesday";
            }
            case 3 -> {
                return "Wednesday";
            }
            case 4 -> {
                return "Thursday";
            }
            case 5 -> {
                return "Friday";
            }
            case 6 -> {
                return "Saturday";
            }
            case 7 -> {
                return "Sunday";
            }
            default -> {
                return "";
            }
        }
    }
}