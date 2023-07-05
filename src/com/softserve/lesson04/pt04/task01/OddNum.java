package com.softserve.lesson04.pt04.task01;

import java.util.Scanner;

public class OddNum {

    private int firstNum;
    private int secondNum;
    private int thirdNum;

    public static int oddNums = 0;

    public OddNum() {

    }

    public OddNum(int firstNum, int secondNum, int thirdNum) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OddNum oddNum = (OddNum) o;

        if (firstNum != oddNum.firstNum) return false;
        if (secondNum != oddNum.secondNum) return false;
        return thirdNum == oddNum.thirdNum;
    }

    @Override
    public int hashCode() {
        int result = firstNum;
        result = 31 * result + secondNum;
        result = 31 * result + thirdNum;
        return result;
    }

    @Override
    public String toString() {
        return "OddNum {" +
                "firstNum= " + firstNum +
                ", secondNum= " + secondNum +
                ", thirdNum= " + thirdNum +
                '}';
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        this.firstNum = scanner.nextInt();
        System.out.println("Input second number: ");
        this.secondNum = scanner.nextInt();
        System.out.println("Input third number: ");
        this.thirdNum = scanner.nextInt();
        scanner.close();
    }

    public void isItOdd(int number) {
        if (number%2 != 0) {
            System.out.println("The number " + number + " is odd");
            oddNums++;
        }
        else
            System.out.println("The number " + number + " is NOT odd");
    }
}
