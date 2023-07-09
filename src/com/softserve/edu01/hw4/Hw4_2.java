package com.softserve.edu01.hw4;

import java.util.Scanner;

public class Hw4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var tryAgain = true;

        while(tryAgain) {
            System.out.println("Enter the number the day of week");
            String numTheDay = scanner.nextLine();

            switch (numTheDay) {
                case "1" -> System.out.println("Monday / Понеділок");
                case "2" -> System.out.println("Tuesday / Вівторок");
                case "3" -> System.out.println("Wednesday / Середа");
                case "4" -> System.out.println("Thursday / Четвер");
                case "5" -> System.out.println("Friday / П'ятниця");
                case "6" -> System.out.println("Saturday / Субота");
                case "7" -> System.out.println("Sunday / Невіля");
                default -> System.out.println("Please enter the number which corresponds to the day of the week! ");
            }
        }
    }
}
