package com.softserve.Homework_Functional_Interfaces;

public class Homework_task03 {
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else return year % 400 == 0;
    }

    public static void main(String[] args) {
        int year1 = 2020;
        int year2 = 2021;
        int year3 = 1900;
        int year4 = 2000;

        System.out.println(year1 + " is a leap year: " + isLeapYear(year1));
        System.out.println(year2 + " is a leap year: " + isLeapYear(year2));
        System.out.println(year3 + " is a leap year: " + isLeapYear(year3));
        System.out.println(year4 + " is a leap year: " + isLeapYear(year4));
    }
}