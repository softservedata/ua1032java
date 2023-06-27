package com.softserve.HomevorkOOP;
import java.util.Scanner;
public class HomeworkOOP_task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        int number3 = scanner.nextInt();

        int smallest = findSmallestNumber(number1, number2, number3);
        System.out.println("The smallest number is: " + smallest);
    }

    public static int findSmallestNumber(int num1, int num2, int num3) {
        int smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        return smallest;
    }
}
