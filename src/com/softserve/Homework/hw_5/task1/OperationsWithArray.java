package com.softserve.Homework.hw_5.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperationsWithArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("Second positive index: " + findSecondPositiveIndex(numbers));
        System.out.println("Minimum value: " + findMinValue(numbers));
        System.out.println("Minimum index: " + findMinIndex(numbers)) ;
        System.out.println("Product of Even elements: " + findProductOfEvens(numbers));
    }
    public static int findSecondPositiveIndex(int[] numbers) {
        int firstPositiveIndex = -1;
        int secondPositiveIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (firstPositiveIndex == -1) {
                    firstPositiveIndex = i;
                } else {
                    secondPositiveIndex = i;
                    break;
                }
            }
        }
        return secondPositiveIndex+1;
    }

    public static int findMinValue ( int[] numbers){
        int minValue = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < minValue) {
                minValue = number;
            }
        }
        return minValue;
    }

    public static int findMinIndex ( int[] numbers){
        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                minIndex = i;
            }
        }
        return minIndex+1;
    }
    public static int findProductOfEvens ( int[] numbers){
        int productOfEvens = 1;
        for (int number : numbers) {
            if (number != 0 && number % 2 == 0) {
                productOfEvens *= number;
            }
        }
        return productOfEvens;
    }
}

