package com.softserve.hw03.Task02;

public class Main2 {
    public static void main(String[] args) {
        SmallestNumber smallestNumber = new SmallestNumber(40, 35, 12);
        System.out.println("Input the first number: " + smallestNumber.getA());
        System.out.println("Input the first number: " + smallestNumber.getB());
        System.out.println("Input the first number: " + smallestNumber.getC());
        System.out.println("The smallest number is " + smallestNumber.TheSmallestNumber());
    }
}
