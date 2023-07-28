package com.softserve.edu.homework.homework_12_Exceptions.task_2;

import java.util.Arrays;

public class Appl {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Number.readNumber(0, 100);
        }
        System.out.println(Arrays.toString(numbers));
    }
}