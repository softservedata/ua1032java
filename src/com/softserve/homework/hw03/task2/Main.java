package com.softserve.homework.hw03.task2;

import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter firth number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter three number: ");
        int num3 = sc.nextInt();

        int minNumber = SmallestNumberFinder.calc(num1, num2, num3);

        System.out.println("The smallest number is: " + minNumber);

        Scanner close;
    }
}