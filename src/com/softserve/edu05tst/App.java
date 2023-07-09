package com.softserve.edu05tst;

public class App {

    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println("2 + 2 = " + calc.add(2, 2));
        System.out.println("20 / 2 = " + calc.div(20, 2));
    }
}
