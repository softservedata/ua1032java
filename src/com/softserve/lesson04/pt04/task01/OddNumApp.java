package com.softserve.lesson04.pt04.task01;

public class OddNumApp {
    public static void main(String[] args) {
        OddNum oddNum = new OddNum();
        oddNum.input();
        oddNum.isItOdd(oddNum.getFirstNum());
        oddNum.isItOdd(oddNum.getSecondNum());
        oddNum.isItOdd(oddNum.getThirdNum());
        System.out.println("There is " + OddNum.oddNums + " odd numbers");
    }
}
