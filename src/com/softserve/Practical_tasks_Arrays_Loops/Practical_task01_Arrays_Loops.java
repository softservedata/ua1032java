package com.softserve.Practical_tasks_Arrays_Loops;
import java.util.Arrays;
import java.util.Scanner;
public class Practical_task01_Arrays_Loops {
    public static void main(String[] args) {
        // Create a string array and sort it
        String[] stringArray = {"banana", "apple", "cherry", "grape", "durian"};
        Arrays.sort(stringArray);
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));

        // Create an array with 5 elements and calculate the average value
        int[] intArray = {4, 7, 12, 5, 9};
        double average = calculateAverage(intArray);
        System.out.println("Average value of the array: " + average);

        // Check if any of the arrays contains a specific value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to search: ");
        int searchValue = scanner.nextInt();

        boolean foundInIntArray = containsValue(intArray, searchValue);
        System.out.println("Value found in intArray: " + foundInIntArray);

        boolean foundInStringArray = containsValue(stringArray, String.valueOf(searchValue));
        System.out.println("Value found in stringArray: " + foundInStringArray);
    }

    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static boolean containsValue(Object[] array, Object searchValue) {
        for (Object element : array) {
            if (element.equals(searchValue)) {
                return true;
            }
        }
        return false;
    }
}
