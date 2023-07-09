package com.softserve.hw04.Task04;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 1;
        int max = 10;
        Random random = new Random();
        int number = random.nextInt(max - min) + min;
        int x;
        do{
            System.out.print("Guess the number: ");
            x = sc.nextInt();
            if(x > number){
                System.out.println("Too high, try again");
            } else if(x < number){
                System.out.println("Too low, try again");
            }
        }while(x != number);
        sc.close();


    }
}
