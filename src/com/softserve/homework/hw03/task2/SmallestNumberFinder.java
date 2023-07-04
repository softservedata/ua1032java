package com.softserve.homework.hw03.task2;

public class SmallestNumberFinder {
    public static int calc ( int number1, int number2, int number3 ) {
        if (number1 == number2 && number1 == number3) {
            return number1;  // All three numbers are equal
        } else if (number1 == number2 || number1 == number3) {
            return Math.min(number1, number3);  // Two numbers are equal, return the smaller one
        } else if (number2 == number3) {
            return number2;  // Two numbers are equal (number2 and number3), return number2
        } else {
            return Math.min(Math.min(number1, number2), number3);  // None of the numbers are equal, find the smallest one
        }
    }
}