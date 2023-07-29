package com.softserve.hw.lesson12.task1;

import java.util.Arrays;

public class Calculate {
    public static double div(double valueOne, double valueTwo) {
        if (valueTwo == 0) {
            throw new ArithmeticException("You divide by zero ");
        }
        return valueOne/valueTwo;
    }
}
