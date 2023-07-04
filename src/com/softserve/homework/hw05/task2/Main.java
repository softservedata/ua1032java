package com.softserve.homework.hw05.task2;
/*
Create a do-while loop that prompts the user to enter two numbers and calculates their sum.
After displaying the result, the program should ask the user if they want to perform the operation again.
If the user inputs a positive response, the loop should repeat; otherwise, it should terminate.

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();

            double sum = num1 + num2;
            System.out.println("The sum is: " + sum);

            System.out.print("Do you want to perform the operation again? (yes/no): ");
            choice = sc.next();
        } while
                (choice.equalsIgnoreCase("yes"));

        sc.close();
    }
}