package com.softserve.practical.dopHW1;
/**
 * Clock shows h hours, m minutes and s seconds after midnight.
 * Your task is to write a function which returns the time since midnight in milliseconds.
 */
public class BeginnerSeries_2_Clock {
    public static void main(String[] args) {
        System.out.println(Past(0, 1, 1));
    }

    public static int Past(int h, int m, int s) {
        return (h * 3600) * 1000 + (m * 60) * 1000 + s * 1000;
    }
}
