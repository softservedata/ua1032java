package com.softserve.homework.hw05.task4;

import java.util.Scanner;

public class AppGame {
    public static void main(String[] args) {
        int from = GuessNumber.inputFrom();
        int to = GuessNumber.inputTo(from);

        int randNumber = GuessNumber.generateRandomNumber(from, to);
        System.out.println("Random: " + randNumber);

        boolean guessed = false;
        do {
            int userNumb = GuessNumber.inputNumber(from, to);
            guessed=GuessNumber.game(randNumber, userNumb);
        }while (!guessed);


    }
}
