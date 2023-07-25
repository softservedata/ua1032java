package com.softserve.homework.hw12.task1;

public class Dividing {
    public static double div(double num1, double num2){
        if(num2 == 0){
            throw new ArithmeticException("Devising by zero is not allowed ");
        }
        return num1/num2;
    }
}
