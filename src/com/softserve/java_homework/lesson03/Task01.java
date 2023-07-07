package com.softserve.java_homework.lesson03;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Float[] numbers = new Float[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextFloat();
        }
        scanner.close();

        boolean result = checkRangeOfNumbers(numbers);
        System.out.println("Are they all belong to the range [-5, 5]: " + result);
    }

    public static boolean checkRangeOfNumbers(Float[] numbers) {
        return numbers[0] <= 5 && numbers[0] >= -5
                && numbers[1] <= 5 && numbers[1] >= -5
                && numbers[2] <= 5 && numbers[2] >= -5;
    }
}