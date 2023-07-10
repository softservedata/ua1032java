package com.softserve.homework.hw05.task4;
/*
4.** Create a program that generates a random number and prompts to the user to guess what the number is.
If the user's guess is higher than the random number, the program should display "Too high, try again."
If the user's guess is lower than the random number, the program should display "Too low, try again."
The program should use a loop that repeats until the user correctly guesses the random number.

 */

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        int guess;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Guess the number (from 1 to 10): ");
            guess = sc.nextInt();

            if (guess > randomNumber) {
                System.out.println("Too high, try again.");
            } else if (guess < randomNumber) {
                System.out.println("Too low, try again.");// here was a mistake
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        } while (guess != randomNumber);
    }
}