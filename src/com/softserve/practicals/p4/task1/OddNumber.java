package com.softserve.practicals.p4.task1;
/*
Input three numbers from console. Find out and output result how many of them are odd.

 */

import java.util.Scanner;

public class OddNumber {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int number1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int number2 = sc.nextInt();

        System.out.println("Enter the third number:");
        int number3 = sc.nextInt();

        int oddCount = 0;

        if (number1 % 2 != 0) {
            oddCount++;
        }

        if (number2 % 2 != 0) {
            oddCount++;
        }

        if (number3 % 2 != 0) {
            oddCount++;
        }

        System.out.println("The number of odd numbers entered is: " + oddCount);
    }
}
