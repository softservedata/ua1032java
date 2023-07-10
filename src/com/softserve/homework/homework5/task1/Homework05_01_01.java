package com.softserve.homework.homework5.task1;

import java.util.Scanner;

public class Homework05_01_01 {
    // TODO: Create a program (in different java documents) that prompts the user to enter:
    //      - a month number and calculates the number of days in that month based on an array
    //      that contains the number of days in each month.

    public static int getMonthDays(int monthNumber) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return monthDays[monthNumber - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int monthNumber;

        System.out.print("Enter a month number: ");
        monthNumber = sc.nextInt();
        if(monthNumber >= 1 && monthNumber <= 12){
            System.out.println("The number of days in that month is " + getMonthDays(monthNumber));
        } else {
            System.out.println("Invalid month number! Try again.");
        }
    }
}
