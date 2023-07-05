package hw05_P_4;

import java.util.Random;
import java.util.Scanner;

/** 4.** Create a program that generates a random number and prompts to the user to guess
 what the number is. If the user's guess is higher than the random number, the program
 should display "Too high, try again." If the user's guess is lower than the random number,
 the program should display "Too low, try again." The program should use a loop that
 repeats until the user correctly guesses the random number.
 */

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int numberRandom = random.nextInt(100) + 1; // Generate a random number from 1 to 100

        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Guess the number:");
            number = scanner.nextInt();

            if (number > numberRandom) {
                System.out.println("Too high, try again.");
            } else if (number < numberRandom) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        } while (number != numberRandom);
    }
}

