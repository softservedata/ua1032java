package com.softserve.java_homework.lesson04;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        int maxValue = getMaxValue(numbers);
        int minValue = getMinValue(numbers);

        System.out.println("Maximum value: " + maxValue);
        System.out.println("Minimum value: " + minValue);
    }

    public static int getMaxValue(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (max < num) max = num;
        }
        return max;
    }

    public static int getMinValue(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (min > num) min = num;
        }
        return min;
    }
}