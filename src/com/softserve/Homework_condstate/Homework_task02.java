package com.softserve.Homework_condstate;
import java.util.Scanner;
public class Homework_task02 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int number3 = scanner.nextInt();

        int maximum = Math.max(Math.max(number1, number2), number3);
        int minimum = Math.min(Math.min(number1, number2), number3);

        System.out.println("Maximum value: " + maximum);
        System.out.println("Minimum value: " + minimum);
    }
}
