package hw11_P_3;

import java.util.Scanner;
import java.util.regex.*;

/**
 *  The task requires implementation of a pattern to match US currency format, which includes a
 * dollar sign ($) followed by any number of digits, a dot, and two digits after the dot. The next step
 * is to input a text containing several instances of US currency format via the console. Finally,
 * display all the occurrences of US currency format on the console screen.
 */

public class Currency {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter text containing instances of the US currency format.
        System.out.print("Enter text containing instances of the US currency format: ");
        String text = new String(scanner.nextLine());

        // Close the Scanner object.
        scanner.close();

        // Use a regular expression to find instances of the US currency format.
        String currencyPattern = "\\$\\d+(\\.\\d{1,2})?(,\\d{1,2})?|\\$\\d+(,\\d{1,2})?(\\.\\d{1,2})?";
        Pattern pattern = Pattern.compile(currencyPattern);
        Matcher matcher = pattern.matcher(text);

        // Find all occurrences of the US currency format and print them to the console.
        System.out.println("Instances of the US currency format in the entered text:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

