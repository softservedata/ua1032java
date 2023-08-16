package com.softserve.hw.lesson5.task1;

public class DayOfMonth {
    public static int seekDayOFMonth(int number) {
        int[] array = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return array[number - 1];
    }
}
