package com.softserve.homework.homework5.task1.task1_1;

import java.util.Scanner;

public class Homework05_01_01 {
    // TODO: Create a program (in different java documents) that prompts the user to enter:
    //      - a month number and calculates the number of days in that month based on an array
    //      that contains the number of days in each month.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar calendar = new Calendar();
        int monthNumber;

        System.out.print("Enter a month number: ");
        monthNumber = sc.nextInt();
        if(monthNumber >= 1 && monthNumber <= 12){
            System.out.println("The number of days in that month is " + calendar.getMonthDays(monthNumber));
        } else {
            System.out.println("Invalid month number! Try again.");
        }
    }
}
