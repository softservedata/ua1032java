package com.softserve.edu01.hw5;

import java.util.Scanner;

public class DoWhile2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String choice;

        do {
            System.out.println("Enter the first number");
            int num1 = scanner.nextInt();

            System.out.println("Enter the second number");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println("Sum: " + sum);

            System.out.println("Do you want to repeat this operation again? (yes/no)");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("yes"));
    }
}
