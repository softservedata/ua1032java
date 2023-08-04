package hw11_P_4;

import java.util.Scanner;
import java.util.Random;

/**
 * 4*. Create a console application that validates user input for their first and last name, ensuring that
 * they only contain English letters, spaces, and hyphens. If the input data is incorrect, prompt the user
 * to re-enter the data. Upon successful entry of the user's first and last names, generate a random
 * greeting message that includes the user's name.
 * To validate the user input, utilize String class methods, control loops, and regular expressions.
 * Generate the random greeting message (use printf() method for output) by creating an array of
 * phrases that contain various text options with the user's name inserted.
 */

//Since both name and surname use the same validation process,
// you might consider simplifying the code to use a single method that gets both values.

//You might want to trim the input before validation to handle accidental leading or trailing spaces.
public class DataVerification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        String surname = "";

        // Ask the user to enter their name and surname.
        do {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();

            System.out.print("Enter your surname: ");
            surname = scanner.nextLine();

            // Check for the correctness of the entered data.
            if (!isValidName(name) || !isValidName(surname)) {
                System.out.println("Invalid data. Please try again.");
            }
        } while (!isValidName(name) || !isValidName(surname));

        // The data is entered correctly, let's display them on the screen.
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);

        // Generate a random greeting message.
        String[] greetings = {
                "Hello, %s!",
                "Welcome, %s!",
                "Good day, %s!",
                "Nice to see you, %s!"
        };

        Random random = new Random();
        int randomIndex = random.nextInt(greetings.length);
        System.out.printf(greetings[randomIndex], name + " " + surname);
    }

    // Method to check the correctness of entering the name and surname using a regular expression.
    private static boolean isValidName(String name) {
        // Use a regular expression to check for only English letters, spaces, and dashes.
        String namePattern = "^[a-zA-Z -]+$";
        return name.matches(namePattern);
    }
}
