package com.softserve.lesson3.hw03.task02;

public class MinNumApp {
    public static void main(String[] args) {
        MinNum minNum = new MinNum();
        minNum.input();
        System.out.println("The smallest number is " + minNum.getMin());
    }
}
