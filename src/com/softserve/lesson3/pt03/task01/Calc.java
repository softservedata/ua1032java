package com.softserve.lesson3.pt03.task01;

import java.util.Scanner;

public class Calc {
    private int firstNum;
    private int secondNum;

    public Calc() {
        firstNum = 0;
        secondNum = 0;
    }

    public static int getNumber (String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextInt();
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

    public int getTotal (int firstNum, int secondNum) {
        int sum = 0;
        sum = firstNum + secondNum;
        return sum;
    }

    public float getAverage (int firstNum, int secondNum) {
        float avg = 0;
        avg = ((float)firstNum + (float)secondNum) / 2;
        return avg;
    }
}
