package com.softserve.edu01.hw5;

import java.util.Scanner;

public class CalculateTheSum12 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = new int[10];

        System.out.println("Enter 10 integer numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        if (numbers[0] > 0 && numbers[1] > 0 && numbers[2] > 0 && numbers[3] > 0 && numbers[4] > 0) {
            int sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
            System.out.println("Sum of the first five positive numbers: " + sum);
        } else {
            long product = (long) numbers[5] * numbers[6] * numbers[7] * numbers[8] * numbers[9];
            System.out.println("Product of the last five non-positive numbers: " + product);
        }
    }
}
