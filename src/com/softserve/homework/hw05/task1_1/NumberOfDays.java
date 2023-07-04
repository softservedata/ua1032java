package com.softserve.homework.hw05.task1_1;
/*
Create a program (in different java documents) that prompts the user to enter:
 a month number and calculates the number of days in that month based on an array that contains the number of days in each month.

 */

import java.util.Scanner;

public class NumberOfDays {
    public static void main ( String[] args ) {
            Scanner sc = new Scanner(System.in);
            System.out.print( "Enter the month number (1-12): " );
            int monthNumber = sc.nextInt();
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (monthNumber >= 1 && monthNumber <= 12) {
                int days = daysInMonth[monthNumber - 1];
                System.out.println("This month have: " + days);
            } else {
                System.out.println("You enter incorrect number!");
            }
    }
}