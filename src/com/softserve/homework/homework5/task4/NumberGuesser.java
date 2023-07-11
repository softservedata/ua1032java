package com.softserve.homework.homework5.task4;

import java.util.Random;

public class NumberGuesser {
    private int number;

    public NumberGuesser() {
        Random rand = new Random();
        number = rand.nextInt(100);
    }
    public NumberGuesser(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void generateNumber(int range) {
        Random rand = new Random();
        number = rand.nextInt(range);
    }

    public boolean checkNumber(int actual){
        if(actual == number){
            System.out.println("You guessed the number, it's " + number);
            return true;
        } else if(actual > number){
            System.out.println("Too high, try again.");
            return false;
        } else {
            System.out.println("Too low, try again.");
            return false;
        }
    }
}
