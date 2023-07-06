package com.softserve.Homework.hw_5.task1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {
    public static int getDaysInMonth(int month) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month < 1 || month > 12) {
            System.out.println("Invalid month number.");
            return 0;
        }
        return daysInMonth[month - 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a month number (1-12): ");
        int month = Integer.parseInt(reader.readLine());
        System.out.println("Number of days in month " + month + ": " + getDaysInMonth(month));
    }
}

