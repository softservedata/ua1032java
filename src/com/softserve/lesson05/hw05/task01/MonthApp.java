package com.softserve.lesson05.hw05.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonthApp {

    public static int getMonthDays (int monthNum) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < monthDays.length; i++) {
            if ((monthNum-1) == i) {
                return monthDays[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of your month: ");
        int monthNumber = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Number of days in " + monthNumber + " month: " + getMonthDays(monthNumber) + " days");

        bufferedReader.close();
    }
}
