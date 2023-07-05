package com.softserve.lesson04.hw04.task02;

public class MaxMinIntegersApp {
    public static void main(String[] args) {
        MaxMinIntegers maxMinIntegers = new MaxMinIntegers();
        maxMinIntegers.input();
        System.out.println("The maximum value is " + maxMinIntegers.maxNum());
        System.out.println("The minimum value is " + maxMinIntegers.minNum());
    }
}
