package com.softserve.java_homework.lesson12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task02 {
        static Scanner scanner = new Scanner(System.in);
        private static final int START = 1;
        private static final int END = 100;
        private static final int MAX_ATTEMPTS = 10;
        private static final Pattern PATTERN = Pattern.compile("\\d+");
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int currentStart = START;
        int count = 0;
        while (count < MAX_ATTEMPTS) {
            try {
                int number = readNumber(currentStart, END);
                numbers.add(number);
                currentStart = number;
                count++;
                if (currentStart >= END - 1) {
                    System.out.println("There are no numbers left between " + currentStart + " and " + END);
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Result: " + numbers);
    }

    public static int readNumber(int start, int end) {
        int number;
        System.out.println("Enter a number bigger than " + start + ", and less than " + end + ":");
        do {
            System.out.print("Enter: ");
            String input = scanner.nextLine();
            if (!PATTERN.matcher(input).matches()) {
                throw new NumberFormatException("Invalid input. The value must be an positive integer.");
            } else {
                number = Integer.parseInt(input);
            }
            if (number <= start || number >= end) {
                System.out.println("The number is out of range.");
            } else break;
        } while (true);
        return number;
    }
}