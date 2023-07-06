package com.softserve.Homework.hw_5.task4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int guess = 0;
        while (guess != number) {
            System.out.print("Enter your guess: ");
            String input = reader.readLine();
            guess = Integer.parseInt(input);
            if (guess > number) {
                System.out.println("Too high, try again.");
            } else if (guess < number) {
                System.out.println("Too low, try again.");
            }
        }
        System.out.println("Congratulations, you guessed the number!");
    }
}
