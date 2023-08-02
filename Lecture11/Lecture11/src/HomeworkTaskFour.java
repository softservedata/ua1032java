import java.util.Random;
import java.util.Scanner;

public class HomeworkTaskFour {
    /* Task 4. Create a console application that validates user input for their first and last name,
     ensuring that they only contain English letters, spaces, and hyphens.
     If the input data is incorrect, prompt the user to re-enter the data.
     Upon successful entry of the user's first and last names, generate a random greeting message that includes the user's name.
     To validate the user input, utilize String class methods, control loops, and regular expressions.
     Generate the random greeting message (use printf() method for output)
     by creating an array of phrases that contain various text options with the user's name inserted. */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String lastName;
        String namePattern = "[A-Za-z -]+";

        do {
            System.out.print("~Input your first name using only English letters, spaces, and hyphens: ");
            firstName = scanner.nextLine();
        } while (!firstName.matches(namePattern));

        do {
            System.out.print("~Input your last name using only English letters, spaces, and hyphens only: ");
            lastName = scanner.nextLine();
        } while (!lastName.matches(namePattern));

        String[] greetings = {
                "Hiii, %s!",
                "Good afternoon, %s! How are you?",
                "Hello, %s! It's a pleasure to meet you.",
                "G’day!, %s! Have a cool day!",
                "Morning, %s!"
        };
        Random random = new Random();
        String greeting = greetings[random.nextInt(greetings.length)];
        System.out.printf(greeting, firstName + " " + lastName);
        scanner.close();
    }
}
