package hw05_P_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/** Create a program (in different java documents) that prompts the user to enter:
  • 10 integers numbers and calculates the sum of the first five elements if they are
 positive, or the product of the last five elements if they are not and output the result.
 • 5 integer numbers and find:
 o position of second positive number;
 o minimum value and its position in the array.
 o calculate the product of all entered even numbers (exclude 0 from even if entered by
 user).
 */

public class TenIntegers {
    public static void main(String[] args) throws IOException {
        int[] numbers = new int[10]; // Array to store 10 integers

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = Integer.parseInt(br.readLine()); // Reading numbers from the console and storing them in the array
        }

        int result; // Variable to store the result

        // Checking if the first five elements are positive numbers
        if (numbers[0] > 0 && numbers[1] > 0 && numbers[2] > 0 && numbers[3] > 0 && numbers[4] > 0) {
            // Calculating the sum of the first five elements
            result = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
            System.out.println("Sum of the first five elements: " + result);
        } else {
            System.out.println("Not all five first numbers are positive.");
        }

        // Checking if the last five elements are negative numbers
        if (numbers[5] < 0 && numbers[6] < 0 && numbers[7] < 0 && numbers[8] < 0 && numbers[9] < 0) {
            // Calculating the product of the last five elements
            result = numbers[5] * numbers[6] * numbers[7] * numbers[8] * numbers[9];
            System.out.println("Product of the last five elements: " + result);
        } else {
            System.out.println("Not all five last numbers are negative.");
        }
    }
}

