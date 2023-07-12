package com.softserve.lesson05.hw05.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GuessTheNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        int guessNum;
        int num = random.nextInt(100);
        do {
            System.out.print("Guess the random number: ");
            guessNum = Integer.parseInt(br.readLine());
            if (guessNum == num) {
                break;
            }
            else if (guessNum > num) {
                System.out.println("Too high, try again.");
            }
            else if (guessNum < num) {
                System.out.println("Too low, try again.");
            }
        } while (true);

        br.close();
    }
}
