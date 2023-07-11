package com.softserve.java_homework.lesson05;

import java.util.Arrays;
import java.util.Scanner;

public class Task013 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        inputNumbers(numbers);
        System.out.println("You have entered: " + Arrays.toString(numbers));

        int indexOfSecondPositiveNumber = getPositionOfSecondPositiveNumber(numbers);
        System.out.println("Position of second positive number: " + indexOfSecondPositiveNumber);

        int indexOfMinNumb = getPositionOfMinimumValue(numbers);
        System.out.println("Minimum number: " + numbers[indexOfMinNumb] + ", Position: " + indexOfMinNumb);

        int evenNumbers = countEvenNumbers(numbers);
        System.out.println("Entered even numbers: " + evenNumbers);
    }

    public static void inputNumbers(int[] numbers) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
        System.out.print("Enter a number: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid number\nEnter: ");
                scanner.next();
            }
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public static int getPositionOfSecondPositiveNumber(int[] numbers) {
        int count = 0;
        int index = 0;
        for (int num : numbers) {
            if (num > 0) count++;
            if (count == 2) break;
            index++;
        }
        return index;
    }

    public static int getPositionOfMinimumValue(int[] numbers) {
        int index = 0;
        int min = numbers[0];
        for (int num : numbers) {
            if (min > num) min = num;
        }
        for (int num : numbers) {
            if (min == num) break;
            index++;
        }
        return index;
    }

    public static int countEvenNumbers(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num != 0 && num % 2 == 0) count++;
        }
        return count;
    }
}