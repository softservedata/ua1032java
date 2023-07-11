package com.softserve.homework.homework5.task4;

import java.util.Scanner;

public class Homework05_04 {
    // TODO: Create a program that generates a random number and prompts to the user to guess
    //      what the number is. If the user's guess is higher than the random number, the program
    //      should display "Too high, try again." If the user's guess is lower than the random number,
    //      the program should display "Too low, try again." The program should use a loop that
    //      repeats until the user correctly guesses the random number.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberGuesser ng = new NumberGuesser();
        int numberInput;
        int range;

        System.out.print("Enter the range of generated number: ");
        range = sc.nextInt();

        ng.generateNumber(range);

        do {
            System.out.print("Enter your number: ");
            numberInput = sc.nextInt();
        } while(!ng.checkNumber(numberInput));
    }
}
