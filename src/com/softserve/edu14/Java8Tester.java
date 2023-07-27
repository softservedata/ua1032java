package com.softserve.edu14;

import java.util.function.*;

public class Java8Tester {
    public static void main(String[] args) {
        Java8Tester tester = new Java8Tester();

        MathOperation addition = Integer::sum; //with type declaration
        MathOperation subtraction = (a, b) -> a - b; //without type declaration
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };
            //with return statement along with curly braces

        MathOperation division = (int a, int b) -> a / b; //without return statement and without curly braces

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
