package com.softserve.java_practical.lesson05;

import java.util.Arrays;
import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(41) - 20;
        }

        System.out.println(Arrays.toString(numbers));

        int max = getMaxValue(numbers);
        System.out.println("The biggest number: " + max);

        int sum = getSumOfPositiveNumbers(numbers);
        System.out.println("Sum of positive numbers: " + sum);

        int countNegative = countNegativeNumbers(numbers);
        System.out.println("Count of negative numbers: " + countNegative);

        compareNegativePositiveCounts(numbers);
    }

    public static int getMaxValue(int[] numbers) {
        int max = numbers[0];
        for (int value : numbers) {
            if (max < value) max = value;
        }
        return max;
    }

    public static int getSumOfPositiveNumbers(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num >= 0) sum += num;
        }
        return sum;
    }

    public static int countNegativeNumbers(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num < 0) count++;
        }
        return count;
    }

    public static int countPositiveNumbers(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num >= 0) count++;
        }
        return count;
    }

    public static void compareNegativePositiveCounts(int[] numbers) {
        int countNegative = countNegativeNumbers(numbers);
        int countPositive = countPositiveNumbers(numbers);
        if (countNegative > countPositive) {
            System.out.println("There are more negative values in the array.");
        } else if (countNegative < countPositive) {
            System.out.println("There are more positive values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        };
    }
}