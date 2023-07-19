package com.softserve.edu.hw5.Homework15;

import java.util.Random;
import java.util.Scanner;

public class guessNum {
    public static void main(String[] args) {
        Random random = new Random(); //creating a class object random
        Scanner sc = new Scanner(System.in);
        int num = random.nextInt(0, 10);
        int i = 0;
        int guessedNum;

        System.out.println("Game: 'guess a number'");
        do{
            System.out.println("Write your number: ");
            guessedNum = sc.nextInt();
            if (guessedNum < num)
                System.out.println("Too low, try again");
            else if(guessedNum > num)
                System.out.println("Too high, try again");
            else if(guessedNum == num) {
                System.out.println("You've found number it's: " + guessedNum);
                break;
            }
            i++;
        }while(i < 4);
        if(i >= 4)
            System.out.println("You've lost all of your chances");
        sc.close();

    }
}
