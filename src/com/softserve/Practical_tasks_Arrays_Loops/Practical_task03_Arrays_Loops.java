package com.softserve.Practical_tasks_Arrays_Loops;
import java.util.Random;
public class Practical_task03_Arrays_Loops {
    public static void main(String[] args) {
        // Create an array of ten random integers
        int[] array = generateRandomArray(10);
        System.out.println("Array: " + java.util.Arrays.toString(array));

        // Find the biggest number in the array
        int maxNumber = findMaxNumber(array);
        System.out.println("Biggest number in the array: " + maxNumber);

        // Calculate the sum of positive numbers
        int sumOfPositives = calculateSumOfPositives(array);
        System.out.println("Sum of positive numbers: " + sumOfPositives);

        // Count the number of negative numbers
        int negativeCount = countNegativeNumbers(array);
        System.out.println("Number of negative numbers: " + negativeCount);

        // Determine if there are more negative or positive values in the array
        String comparisonResult = compareNegativeAndPositiveCount(negativeCount, array.length);
        System.out.println(comparisonResult);
    }

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    public static int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    public static int calculateSumOfPositives(int[] array) {
        int sum = 0;
        for (int number : array) {
            if (number > 0) {
                sum += number;
            }
        }
        return sum;
    }

    public static int countNegativeNumbers(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number < 0) {
                count++;
            }
        }
        return count;
    }

    public static String compareNegativeAndPositiveCount(int negativeCount, int arrayLength) {
        int positiveCount = arrayLength - negativeCount;
        if (negativeCount > positiveCount) {
            return "There are more negative values in the array.";
        } else if (negativeCount < positiveCount) {
            return "There are more positive values in the array.";
        } else {
            return "There are an equal number of positive and negative values in the array.";
        }
    }
}
