package com.softserve.lesson03.hw03.task02;

public class MinNumApp {
    public static void main(String[] args) {
        MinNum minNum = new MinNum();
        minNum.input();
        System.out.println("The smallest number is " + minNum.getMin());
    }
}
