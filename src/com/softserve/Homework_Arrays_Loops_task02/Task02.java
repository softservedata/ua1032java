package com.softserve.Homework_Arrays_Loops_task02;
import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        do {
            System.out.print("Enter the first number: ");
            int number1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int number2 = scanner.nextInt();

            int sum = number1 + number2;
            System.out.println("Sum: " + sum);

            System.out.print("Do you want to perform the operation again? (y/n): ");
            userInput = scanner.next();
        } while (userInput.equalsIgnoreCase("y"));

        System.out.println("Program terminated.");
    }
}
