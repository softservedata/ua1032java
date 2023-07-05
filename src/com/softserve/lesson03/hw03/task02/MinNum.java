package com.softserve.lesson03.hw03.task02;

import java.util.Scanner;

public class MinNum {

    private int firstNum;
    private int secondNum;
    private int thirdNum;

    public MinNum() {
        firstNum = 0;
        secondNum = 0;
        thirdNum = 0;
    }

    public MinNum (int firstNum, int secondNum, int thirdNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.thirdNum = thirdNum;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public int getThirdNum() {
        return thirdNum;
    }

    public void setThirdNum(int thirdNum) {
        this.thirdNum = thirdNum;
    }

    @Override
    public String toString() {
        return "MinNum {" +
                "firstNum= " + firstNum +
                ", secondNum= " + secondNum +
                ", thirdNum= " + thirdNum +
                '}';
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        this.firstNum = scanner.nextInt();
        System.out.println("Input the second number: ");
        this.secondNum = scanner.nextInt();
        System.out.println("Input the third number: ");
        this.thirdNum = scanner.nextInt();
    }

    public int getMin() {
        if (Math.min(this.firstNum, this.secondNum)<=Math.min(this.secondNum, this.thirdNum))
            return Math.min(this.firstNum, this.secondNum);
        else
            return Math.min(this.secondNum, this.thirdNum);
    }
}
