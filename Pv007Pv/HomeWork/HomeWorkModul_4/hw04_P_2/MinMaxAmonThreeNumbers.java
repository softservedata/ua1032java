package hw04_P_2;

import java.util.Scanner;

/**
 * Input three integer numbers and output the maximum and minimum values of them to
 * the console.
 */
public class MinMaxAmonThreeNumbers {


    /* The method output the maximum and minimum values of three integer numbers to
    the console.*/
    static void minAndMax(int a, int b, int c) {
        if ((a < b) && (a < c)) {
            System.out.println("Minimum values: " + a);
        } else if ((b < a) && (b < c)) {
            System.out.println("Minimum values: " + b);
        } else if ((c < a) && (c < b)) {
            System.out.println("Minimum values: " + c);
        }

        if ((a > b) && (a > c)) {
            System.out.println("Maximum values: " + a);
        } else if ((b > a) && (b > c)) {
            System.out.println("Maximum values: " + b);
        } else if ((c > a) && (c > b)) {
            System.out.println("Maximum values: " + c);
        }
    }

    public static void main(String[] args) {
        // Creating a Scanner object for reading input from the console.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = Integer.parseInt(input.nextLine()); // Reading the entered value of the first number.

        System.out.println("Enter the second number: ");
        int b = Integer.parseInt(input.nextLine()); // Reading the entered value of the second number.

        System.out.println("Enter the first number: ");
        int c = Integer.parseInt(input.nextLine()); // Reading the entered value of the third number.

        minAndMax(a, b, c);  // getting the result from the method belongRange
        input.close();// Closing the Scanner object.
    }
}
