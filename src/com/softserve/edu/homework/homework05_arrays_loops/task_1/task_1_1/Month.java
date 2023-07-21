package com.softserve.edu.homework.homework05_arrays_loops.task_1.task_1_1;

import java.util.Scanner;
public class Month {

    public static int getNumberOfDaysInMonth(int monthNumber, int[] monthDays) {
        return monthDays[monthNumber - 1];
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int monthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        System.out.print("Enter a month number: ");
        int monthNumber = Integer.parseInt(input.nextLine());

        int numberOfDays = getNumberOfDaysInMonth(monthNumber, monthDays);
        System.out.println("This month has " + numberOfDays + " days.");
    }
}
