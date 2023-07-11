package com.softserve.java_homework.lesson03;

import java.util.Scanner;

class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        int smallestNumb = getMinNumber(numbers);
        System.out.println("The smallest number is: " + smallestNumb);
    }

    public static int getMinNumber(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (min > number) min = number;
        }
        return min;
    }
}