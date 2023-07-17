package com.softserve.edu01.hw5;

import java.util.Scanner;

public class MonthAndDays11 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int [] daysMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Enter a month number from 1 to 12: ");
        int month = scanner.nextInt();

        if (month >= 1 && month <= 12) {
            int days = daysMonth[month - 1];
            System.out.println("Number days in month " + month + " are " + days);
        } else {
            System.out.println("False month number.");
        }
    }
}
