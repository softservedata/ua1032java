package com.softserve.lesson04.hw04.task02;

import java.util.Scanner;

public class MaxMinIntegers {
    private int firstNum;
    private int secondNum;
    private int thirdNum;

    public MaxMinIntegers() {
    }

    public MaxMinIntegers(int firstNum, int secondNum, int thirdNum) {
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

        MaxMinIntegers that = (MaxMinIntegers) o;

        if (firstNum != that.firstNum) return false;
        if (secondNum != that.secondNum) return false;
        return thirdNum == that.thirdNum;
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
        return "MaxMinIntegers{" +
                "firstNum= " + firstNum +
                ", secondNum= " + secondNum +
                ", thirdNum= " + thirdNum +
                '}';
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        this.firstNum = scanner.nextInt();
        System.out.println("Enter second number: ");
        this.secondNum = scanner.nextInt();
        System.out.println("Enter third number: ");
        this.thirdNum = scanner.nextInt();
        scanner.close();
    }

    public int maxNum() {
        if (Math.max(this.firstNum, this.secondNum) >= Math.max(this.secondNum, this.thirdNum))
        {
            return Math.max(this.firstNum, this.secondNum);
        }

        return Math.max(this.secondNum, this.thirdNum);
    }

    public int minNum() {
        if (Math.min(this.firstNum, this.secondNum) <= Math.min(this.secondNum, this.thirdNum))
        {
            return Math.min(this.firstNum, this.secondNum);
        }

        return Math.min(this.secondNum, this.thirdNum);
    }
}
