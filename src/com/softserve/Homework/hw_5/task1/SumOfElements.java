package com.softserve.Homework.hw_5.task1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        if (areFirstFivePositive(numbers)) {
            int sum = sumOfFirstFive(numbers);
            System.out.println("Sum of first five elements: " + sum);
        } else {
            int product = productOfLastFive(numbers);
            System.out.println("Product of last five elements: " + product);
        }
    }

    public static boolean areFirstFivePositive(int[] numbers) {
        for (int i = 0; i < 5; i++) {
            if (numbers[i] <= 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumOfFirstFive(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static int productOfLastFive(int[] numbers) {
        int product = 1;
        for (int i = numbers.length - 5; i < numbers.length; i++) {
            product *= numbers[i];
        }
        return product;
    }
}
