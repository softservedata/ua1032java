package com.softserve.edu01.hw5;

import java.util.Scanner;

public class FiveIntNum13 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 integer numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int secondPositiveIndex = findSecondPositive(numbers);
        int minimumValue = findMinimumValue(numbers);
        int minimumValueIndex = findMinimumValueIndex(numbers);
        long evenProduct = calculateEvenProduct(numbers);

        System.out.println("Position of the second positive number: " + secondPositiveIndex);
        System.out.println("Minimum value: " + minimumValue);
        System.out.println("Position of the minimum value: " + minimumValueIndex);
        System.out.println("Product of all even numbers (excluding 0): " + evenProduct);
    }

    private static int findSecondPositive(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                count++;
                if (count == 2) {
                    return i;
                }
            }
        }
        return -1;
    }

    private static int findMinimumValue(int[] numbers) {
        int minimum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }
        return minimum;
    }

    private static int findMinimumValueIndex(int[] numbers) {
        int minimum = numbers[0];
        int index = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
                index = i;
            }
        }
        return index;
    }

    private static long calculateEvenProduct(int[] numbers) {
        long product = 1;
        for (int number : numbers) {
            if (number != 0 && number % 2 == 0) {
                product *= number;
            }
        }
        return product;
    }
}

