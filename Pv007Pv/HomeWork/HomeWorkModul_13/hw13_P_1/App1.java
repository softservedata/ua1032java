package hw13_P_1;

import java.util.function.BiFunction;
import java.util.Scanner;

/**
 * 1. Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
 * Method encrypt should take a string and return coded string where every letter is moved
 * on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should
 * return decoded value
 * */
//Overall, the code is well-written and adheres to best practices. Good job!
public class App1 {

    // Lambda function for encrypting a message
    static BiFunction<String, Integer, String> encrypt = (message, n) -> {
        // Create a StringBuilder to store the encrypted message
        StringBuilder encryptedMessage = new StringBuilder();
        // Iterate through each character of the message
        for (char ch : message.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Determine the base character (uppercase or lowercase)
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                // Encrypt the character by shifting it by n positions in the alphabet
                int encryptedChar = (ch - base + n) % 26 + base;
                // Append the encrypted character to the StringBuilder
                encryptedMessage.append((char) encryptedChar);
            } else {
                // If the character is not a letter, append it as is to the StringBuilder
                encryptedMessage.append(ch);
            }
        }
        // Convert the StringBuilder to a String and return the encrypted message
        return encryptedMessage.toString();
    };

    // Lambda function for decrypting a message
    static BiFunction<String, Integer, String> decrypt = (message, n) -> encrypt.apply(message, 26 - n);

    public static void main(String[] args) {
        // Create a Scanner object for reading input from the console
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter the message to encrypt
            System.out.println("Enter the message to encrypt: ");
            // Read the entered message from the console
            String message = scanner.nextLine();

            // Prompt the user to enter the number of positions to shift in the alphabet
            System.out.println("Enter the number of positions to shift in the alphabet: ");
            // Read the entered shift value from the console
            int shift = scanner.nextInt();

            // Encryption of the message using the encrypt lambda function
            String encryptedMessage = encrypt.apply(message, shift);
            // Display the encrypted message
            System.out.println("Encrypted message: " + encryptedMessage);

            // Decryption of the message using the decrypt lambda function
            String decryptedMessage = decrypt.apply(encryptedMessage, shift);
            // Display the decrypted message
            System.out.println("Decrypted message: " + decryptedMessage);
        } catch (java.util.InputMismatchException e) {
            // Handle the case when the user enters an invalid input for the shift value
            System.out.println("Invalid input. The number of positions to shift must be an integer.");
        } catch (java.util.NoSuchElementException e) {
            // Handle the case when the user does not enter any input or presses Ctrl+D (EOF)
            System.out.println("Input error. Please enter valid data.");
        } finally {
            // Close the Scanner object to release resources
            scanner.close();
        }
    }
}
