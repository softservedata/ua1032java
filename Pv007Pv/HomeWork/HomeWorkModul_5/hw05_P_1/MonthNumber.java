package hw05_P_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** Create a program (in different java documents) that prompts the user to enter:
 • a month number and calculates the number of days in that month based on an array
 that contains the number of days in each month.
 • 10 integers numbers and calculates the sum of the first five elements if they are
 positive, or the product of the last five elements if they are not and output the result.
 • 5 integer numbers and find:
 o position of second positive number;
 o minimum value and its position in the array.
 o calculate the product of all entered even numbers (exclude 0 from even if entered by
 user).
 */

public class MonthNumber {

    public static int howManyDays(int month) throws IOException {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Leap year? Yes/No");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String year = br.readLine().toLowerCase();

        // Checking if it is a leap year
        if (year.equals("yes")) {
            daysInMonth[1] = 29;  // Modify the number of days in February to 29
        }
        return daysInMonth[month];  // Return the number of days for the specified month
    }

    public static void main(String[] args) throws IOException {
        String[] months = {"january", "february", "march", "april", "may", "june", "july",
                "august", "september", "october", "november", "december"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the month number:");
        int month = Integer.parseInt(br.readLine()) - 1;  // Convert the entered month number to an integer

        System.out.println("The month " + months[month] + " has " + howManyDays(month) + " days.");
    }
}
