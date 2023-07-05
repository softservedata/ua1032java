package com.softserve.hw.lesson5.task4;

import java.util.Scanner;

public class RandomNumber {
    public static void generate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select difficulty level\nEasy 1/10\nNormal -20/20\nHard -50/50\nVery Hard -100/100");
        String difficultLevel = sc.next();
        int number = switch (difficultLevel) {
            case "Easy" -> (int) (Math.random() * 10);
            case "Normal" -> (int) (-20 + Math.random() * 20);
            case "Hard" -> (int) (-50 + Math.random() * 50);
            case "Very Hard" -> (int) (-100 + Math.random() * 100);
            default -> 0;
        };
        int numberUser;
        do {
            System.out.println("Please input your number");
            numberUser = sc.nextInt();
            if (numberUser > number) {
                System.out.println("Too high, try again.");
            } else if (numberUser < number) {
                System.out.println("Too low, try again.");
            }
        } while (number != numberUser);
        System.out.println("You win!");
    }
}
