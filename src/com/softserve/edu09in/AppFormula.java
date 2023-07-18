package com.softserve.edu09in;

interface Formula {
    double calculate(int a); // public abstract by default;

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}

public class AppFormula {
    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 5);
            }
        };
        //
        double result = formula.calculate(20);
        System.out.println("Square root of 100 is " + result);
        //
        //AppFormula$1 a2;
    }
}
