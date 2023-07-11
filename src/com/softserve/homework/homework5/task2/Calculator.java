package com.softserve.homework.homework5.task2;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    private int a;
    private int b;

    public Calculator() {
        a = 0;
        b = 0;
    }
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calcSum() {
        return a + b;
    }

    public boolean checkInput(String calcInput) {
        boolean calcSumLoop = false;

        if(Objects.equals(calcInput, "+")){
            calcSumLoop = true;
            return calcSumLoop;
        } else if (Objects.equals(calcInput, "-")){
            return calcSumLoop;
        } else {
            return calcSumLoop;
        }
    }

    public void startCalculations() {
        String calcInput;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            a = sc.nextInt();
            System.out.print("Enter the second number: ");
            b = sc.nextInt();
            System.out.println(a + " + " + b + " = " + calcSum());
            System.out.println("Would you like to continue the calculations? (+/-)");
            calcInput = sc.next();
        } while (checkInput(calcInput));
    }
}
