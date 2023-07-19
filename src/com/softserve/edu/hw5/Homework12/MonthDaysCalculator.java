package com.softserve.edu.hw5.Homework12;

import java.util.Scanner;

public class MonthDaysCalculator {
    private int monthNum;
    private void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write number of month " +
                "(it will output month's umber of days): ");
        monthNum = sc.nextInt();
        sc.close();
    }
    public int numOfMonth()
    {
        input();
        int daysInMonth[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        monthNum -= 1;
        if (monthNum < 1 && monthNum > 11){
            monthNum = 0;
            return monthNum;
        }
        return daysInMonth[monthNum];
    }
}
