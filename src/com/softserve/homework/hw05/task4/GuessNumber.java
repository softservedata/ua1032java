package com.softserve.homework.hw05.task4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static int inputFrom() {
        Scanner sc = new Scanner(System.in);
        int from = 0;
        boolean validInput = false;

        do {
            System.out.print("Input from what number to generate: ");
            try {
                from = sc.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.nextLine(); // Clear the invalid input from the scanner
            }
        } while (!validInput);

        return from;
    }

    public static int inputTo(int from) {
        Scanner sc = new Scanner(System.in);
        int to = 0;
        boolean validInput = false;

        do {
            System.out.print("Input to what number to generate: ");
            try {
                to = sc.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.nextLine(); // Clear the invalid input from the scanner
            }
            if(from > to) validInput=false;
        } while (!validInput);

        return to;
    }

    public static int generateRandomNumber(int from, int to) {
        Random random = new Random();
        return random.nextInt(to - from + 1) + from;
    }

    public static int inputNumber(int from, int to){
        Scanner sc = new Scanner(System.in);
        int userNumb;
        do{
            System.out.print("Input number from " + from + " to " + to + ": ");
            userNumb = sc.nextInt();
        }while (userNumb< from || userNumb > to);
        return userNumb;
    }

    public static boolean game(int randNum, int userNumb){
            if(userNumb == randNum){
                System.out.println("Guessed successfully! Rand num was : " + randNum);
                return true;
            }else if(userNumb > randNum){
                System.out.println("Too high, try again :");
                return false;
            }else{
                System.out.println("Too low, try again :");
                return false;
            }
    }
}
