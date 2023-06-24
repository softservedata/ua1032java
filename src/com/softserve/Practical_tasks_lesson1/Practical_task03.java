package com.softserve.Practical_tasks_lesson1;
import java.util.Scanner;
public class Practical_task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Arithmetic Calculator!");

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int division = a / b;

        System.out.println("Sum of a and b: " + sum);
        System.out.println("Difference of a and b: " + difference);
        System.out.println("Product of a and b: " + product);
        System.out.println("Division of a and b: " + division);

        scanner.close();
    }
}
