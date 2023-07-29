package com.softserve.hw.lesson12.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {
    public static int readNumber(int start, int end) {
        try {
            int number = new Scanner(System.in).nextInt();
            if (number < start || number > end) {
                throw new IllegalArgumentException("You input invalid argument");
            } else return number;
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("error");
            System.out.println(e);
            return 0;
        }

    }
}
