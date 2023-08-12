package com.softserve.edu01.hw12.task2;

import java.util.Scanner;

import static com.softserve.edu01.hw12.task2.Method.readNumber;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            try {
                numbers[i] = readNumber(i > 0 ? numbers[i - 1] + 1 : 1, 100);
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
                i--;
            }
        }

        System.out.println("Entered numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
