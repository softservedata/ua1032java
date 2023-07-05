package com.softserve.lesson03.pt03.task01;

public class CalcApp {


    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.setFirstNum(Calc.getNumber("Enter the first number : "));
        calc.setSecondNum(Calc.getNumber("Enter the second number : "));
        System.out.println("The sum of " + calc.getFirstNum() + " and " + calc.getSecondNum()
                + " is " + calc.getTotal(calc.getFirstNum(), calc.getSecondNum()));
        System.out.println("The average of " + calc.getFirstNum() + " and " + calc.getSecondNum()
                + " is " + calc.getAverage(calc.getFirstNum(),calc.getSecondNum()));

    }
}
