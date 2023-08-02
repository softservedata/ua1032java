package com.softserve.hw.lesson12;


import com.softserve.hw.lesson12.task2.Number;
import com.softserve.hw.lesson12.task1.Calculate;

import java.util.ArrayList;
import java.util.List;

import static com.softserve.hw.lesson12.task2.Number.readNumber;

public class mainLesson12 {
    public static void main(String[] args) {
//        System.out.println("task1");
//        System.out.println(Calculate.div(2, 2));
//        System.out.println(Calculate.div(4, 2));
//        System.out.println(Calculate.div(10, 2));
//        System.out.println(Calculate.div(1, 2));
//        System.out.println(Calculate.div(0.1, 2));
//        System.out.println(Calculate.div(-10, 2));
//        System.out.println(Calculate.div(0, 2));
//        System.out.println(Calculate.div(2, 0));
        System.out.println("task2");
        System.out.println("Please enter 10 numbers:");
        int prevNumber = 1;
        for (int i = 1; i <=10; i++) {
            int number = Number.readNumber(prevNumber, 10*i);
            if (number <= prevNumber) {
                System.out.println("The entered number should be greater than the previous one. Please try again.");
                i--;
            } else {
                prevNumber = number;
            }
        }
        System.out.println("You have entered 10 valid numbers.");
    }
}
