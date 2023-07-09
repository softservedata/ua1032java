package com.softserve.edu01.Hw4;

import java.util.Scanner;

public class Hw4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the first number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the first number: ");
        int num3 = scanner.nextInt();

        scanner.close();

        int oddCount = 0;

        if (num1 % 2 != 0) {
            oddCount++;
        }

        if (num2 % 2 != 0) {
            oddCount++;
        }

        if (num3 % 2 != 0) {
            oddCount++;
        }

        System.out.println("Number of odd numbers: " + oddCount);

    }
}
