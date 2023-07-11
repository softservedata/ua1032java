package com.softserve.homework.homework5.task1.task1_1;

public class Calendar {
    private final int[] days;

    public Calendar() {
        days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }

    public int getMonthDays(int monthNumber) {
        return days[monthNumber - 1];
    }
}
