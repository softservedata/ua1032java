package hw13_P_3;

import java.util.Scanner;

/**
 * 3. Create method which take year as a parameter and return true if year is a leap
 * */

public class App3 {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a year to check if it's a leap year: ");
            int year = scanner.nextInt();

            // Call the isLeapYear method and display the result on the screen
            System.out.println(year + " is a leap year: " + isLeapYear(year));
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid year.");
        } finally {
            scanner.close();
        }
    }
}

