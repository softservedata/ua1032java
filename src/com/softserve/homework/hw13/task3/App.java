package com.softserve.homework.hw13.task3;
/*
3. Create method which take year as a parameter and return true if year is a leap
3. Створіть метод, який приймає рік як параметр і повертає істину, якщо рік є високосним
 */

public class App {
    public static boolean isLeapYear ( int year ) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public static void main ( String[] args ) {
        System.out.println(isLeapYear( 2023 ) );
        System.out.println(isLeapYear( 2024 ) );
        System.out.println(isLeapYear( 2025 ) );
    }
}
