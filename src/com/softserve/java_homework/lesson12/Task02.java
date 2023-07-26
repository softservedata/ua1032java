package com.softserve.java_homework.lesson12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int start = 1;
        int end = 100;
        for (int i = 0; i < 10; i++) {
            try {
                int number = readNumber(start, end, scanner);
                while (number <= start || number >= end) {
                    System.out.println("Number is out of range.");
                    number = readNumber(start, end, scanner);
                }
                numbers.add(number);
                start = number;
                if (start == end - 1) {
                    System.out.println("There are no numbers left between " + start + " and " + end);
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Result: " + numbers);
    }

    public static int readNumber(int start, int end, Scanner scanner) {
        String p = "\\d+";
        int number;
        System.out.println("Enter a number bigger than " + start + ", and less than " + end + ":");
        System.out.print("Enter: ");
        String input = scanner.nextLine();
        if (!input.matches(p)) {
            throw new NumberFormatException("Invalid input. The value must be an positive integer.");
        } else {
            number = Integer.parseInt(input);
        }
        return number;
    }
}