package com.softserve.homework.hw05.task1;

import java.util.Scanner;

public class Month {

    private final int[] daysInMonth = {
            31, // January
            28, // February
            31, // March
            30, // April
            31, // May
            30, // June
            31, // July
            31, // August
            30, // September
            31, // October
            30, // November
            31  // December
    };

    public static int getMonth(){
        Scanner sc = new Scanner(System.in);

        int monthNumber;
        do {
            System.out.print("Input month number: ");
            monthNumber = sc.nextInt();
        }while (monthNumber > 12 && monthNumber <= 0);

        return monthNumber;
    }

    public int calculateDaysInMonth(int monthNumber){
        return daysInMonth[(monthNumber-1)];
    }
}
