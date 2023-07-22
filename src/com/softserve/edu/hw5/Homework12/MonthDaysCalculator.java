package com.softserve.edu.hw5.Homework12;

import java.util.Scanner;

public class MonthDaysCalculator {
    private int monthNum;
    private int daysInMonth[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write number of month " +
                "(it will output month's umber of days): ");
        monthNum = sc.nextInt() - 1;
        sc.close();
    }

    public void setMonthNum(int monthNum) {
        this.monthNum = monthNum;
    }

    public int[] getDaysInMonth() {
        return daysInMonth;
    }

    public int getMonthNum() {
        return monthNum;
    }

    public int numOfMonth()
    {
        if (monthNum < 1 && monthNum > 11){
            monthNum = 0;
            return monthNum;
        }
        return daysInMonth[monthNum];
    }
}
