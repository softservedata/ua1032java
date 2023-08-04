package hm12;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * You are closing the Scanner object at the end of the readNumber method,
 * but you call the readNumber method multiple times.
 * This means that after the first call to readNumber,
 * the Scanner object is closed and cannot be used again,
 * resulting in an exception on subsequent calls.
 * You should close the Scanner object only once, at the end of the main method.
 * The given task specifies that the numbers should be in increasing order,
 * but your current code does not enforce that rule.
 *
 * */
public class task02 {
    public static class NumberReader {
        public static void main(String[] args) {
            int[] numbers = new int[10];

            for (int i = 0; i < numbers.length; i++) {
                try {
                    numbers[i] = readNumber(1, 100);
                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid number entered. Please try again.");
                    i--;
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: The number is not in the range [1...100]. Please try again.");
                    i--;
                }
            }
            System.out.println("entered numbers");
            for (int num : numbers) {
                System.out.println(num + " ");
            }
        }

        private static int readNumber(int start, int end) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Enter a number in [" + start + "..." + end + "]: "
                );
                int num = scanner.nextInt();

                if (num < start || num > end) {
                    throw new IllegalArgumentException();
                }
                return num;
            } catch (InputMismatchException e) {

                throw new InputMismatchException();
            } finally {
                scanner.close();
            }
        }
    }
}
