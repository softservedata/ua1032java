package com.softserve.homework.homework5;

import java.util.Random;
import java.util.Scanner;

public class Homework05_04 {
    // TODO: Create a program that generates a random number and prompts to the user to guess
    //      what the number is. If the user's guess is higher than the random number, the program
    //      should display "Too high, try again." If the user's guess is lower than the random number,
    //      the program should display "Too low, try again." The program should use a loop that
    //      repeats until the user correctly guesses the random number.

    public static boolean guessNumber(int actual, int expected){
        if(actual == expected){
            System.out.println("You guessed the number, it's " + expected);
            return true;
        } else if(actual > expected){
            System.out.println("Too high, try again.");
            return false;
        } else {
            System.out.println("Too low, try again.");
            return false;
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int range;
        int numberInput;

        System.out.print("Enter the range of generated number: ");
        range = sc.nextInt();

        int numberRandom = rand.nextInt(range);
        do {
            System.out.print("Enter your number: ");
            numberInput = sc.nextInt();
        } while(!guessNumber(numberInput, numberRandom));
    }
}
