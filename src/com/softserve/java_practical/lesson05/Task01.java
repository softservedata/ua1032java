package com.softserve.java_practical.lesson05;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        String[] cars = {"Toyota", "Audi", "BMW", "Bentley", "Mercedes-Benz",
                "Volkswagen", "Mazda", "Lexus", "Volvo", "Tesla"};

        System.out.print("Cars before sorting order: ");
        for (String car : cars) {
            System.out.print(car + " ");
        }

        System.out.print("\nCars after sorting order: ");
        Arrays.sort(cars);
        for (String car : cars) {
            System.out.print(car +  " ");
        }

        double[] numbers = {3, 4.6, 63.2, 6.1, 32.8, 7, 4, 8.4, 9.9};
        System.out.println();
        for (double num : numbers) System.out.print(num + "  ");
        double average = getAverage(numbers);
        System.out.println("\nAverage: " + average);

        Scanner scanner = new Scanner(System.in);
        boolean containsValue = checkIfContainsValue(cars, scanner);
        scanner.close();
        System.out.println("The array contains the value: " + containsValue);
    }

    public static double getAverage(double[] numbers) {
        double sum = 0;
        for (double num : numbers) sum += num;
        return Math.round(sum / numbers.length * 100.0) / 100.0;
    }

    public static boolean checkIfContainsValue(String[] arr, Scanner scanner) {
        System.out.print("Enter a value: ");
        String value = scanner.nextLine();
        for (String str : arr) {
            if (value.equals(str)) return true;
        }
        return false;
    }
}