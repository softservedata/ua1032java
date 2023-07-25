package com.softserve.homework.hw12.task2;

import java.util.ArrayList;

public class AppNumberInRange {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            boolean validInput = false;
            while (!validInput) {
                try {
                    int userInput = ReadNumber.readNumber(1, 12);
                    numberList.add(userInput);
                    validInput = true;
                } catch (IllegalArgumentException e) {
                    System.err.println("Error: " + e.getMessage());
                }
            }
        }
        System.out.println(numberList);
    }
}
