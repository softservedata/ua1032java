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
                return "EN: Monday, UA: Понеділок";
            }
            case 2 -> {
                return "EN: Tuesday, UA: Вівторок";
            }
            case 3 -> {
                return "EN: Wednesday, UA: Середа";
            }
            case 4 -> {
                return "EN: Thursday, UA: Четвер";
            }
            case 5 -> {
                return "EN: Friday, UA: П'ятниця";
            }
            case 6 -> {
                return "EN: Saturday, UA: Субота";
            }
            case 7 -> {
                return "EN: Sunday, UA: Неділя";
            }
            default -> {
                return "";
            }
        }
    }
}