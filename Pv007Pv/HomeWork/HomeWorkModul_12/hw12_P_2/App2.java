package hw12_P_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2. Create a method readNumber(int start, int end), that read from console integer number
 * and return it, if it is in the range [start...end]. If an invalid number or non-number text is
 * read, the method should throw an exception.
 * Using this method write a method main(), that must enter 10 numbers:
 * a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
 * */

public class App2 {

    // Method for reading an integer from the console within a specified range.
    public static int readNumber(int start, int end) throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            try {
                // Prompt the user to enter an integer within the specified range.
                System.out.printf("Enter an integer within the range from %d to %d: ", start, end);
                String input = scanner.next();
                number = Integer.parseInt(input);

                // Check if the entered number is within the specified range
                if (number >= start && number <= end) {
                    break; // Exit the loop if the number is within the specified range
                } else {
                    // Notify the user that the entered number is out of range
                    System.out.println("The number is out of range. Enter a valid integer.");
                }
            } catch (NumberFormatException e) {
                // Notify the user that the entered input is not a valid integer
                System.out.println("Invalid input. Enter a valid integer.");
            }
        }

        // Return the valid number entered by the user
        return number;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int[] numbers = new int[10];

        // Prompt the user to enter 10 numbers satisfying the condition 1 < a1 < a2 < ... < a10 < 100.
        System.out.println("Please enter 10 numbers such that 1 < a1 < a2 < ... < a10 < 100:");

        for (int i = 0; i < 10; i++) {
            // Prompt the user to enter each number using the readNumber method.
            numbers[i] = readNumber(start, end);

            // Update the start value to be greater than the previously entered number.
            start = numbers[i] + 1;
        }

        // Print the entered numbers using Arrays.toString().
        System.out.println("Entered numbers: " + Arrays.toString(numbers));
    }
}
