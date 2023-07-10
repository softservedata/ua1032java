package com.softserve.edu01.hw4;

import java.util.Scanner;

public class Hw4_2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter first integer number");
        int num1 = scanner.nextInt();

        System.out.println("Enter second integer number");
        int num2 = scanner.nextInt();

        System.out.println("Enter third integer number");
        int num3 = scanner.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Number 1 is MAX value");
        } else if (num2 >= num1 && num2>= num3) {
            System.out.println("Number 2 is MAX value");
        } else if (num3 >= num1 && num3>= num2) {
            System.out.println("Number 3 is MAX value");
        }
        if (num1 <= num2 && num1 <= num3) {
            System.out.println("Number 1 is MIN value");
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("Number 2 is MIN value");
        } else if (num3 <= num1 && num3 <= num2) {
            System.out.println("Third is MIN value");
        }

    }
}
