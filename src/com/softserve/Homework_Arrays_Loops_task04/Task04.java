package com.softserve.Homework_Arrays_Loops_task04;
import java.util.Random;
import java.util.Scanner;
public class Task04 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int guess;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Guess the number: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > randomNumber) {
                System.out.println("Too high, try again.");
            } else if (guess < randomNumber) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        } while (guess != randomNumber);
    }
}
