package com.softserve.homework.hw03.task2;
/*
Input three integer numbers and and output the maximum and minimum values of them to the console.
 */
import java.util.Scanner;

public class MinMaxValue {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer number: ");
    int num1 = scanner.nextInt();

        System.out.print("Enter the second integer number: ");
    int num2 = scanner.nextInt();

        System.out.print("Enter the third integer number: ");
    int num3 = scanner.nextInt();

    int max = Math.max(Math.max(num1, num2), num3);
       int min = Math.min(Math.min(num1, num2), num3);

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        scanner.close();
    }
}
