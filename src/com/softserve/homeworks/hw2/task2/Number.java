package com.softserve.homeworks.hw2.task2;

public class Number {
    private int firstnumber;// аналогічно до першої таски
    private int secondnumber;
    private int thirdnumber;

    public Number(int firstnumber, int secondnumber, int thirdnumber) {
        this.firstnumber = firstnumber;
        this.secondnumber = secondnumber;
        this.thirdnumber = thirdnumber;
    }

    public int getFirstnumber() {
        return firstnumber;
    }

    public int getSecondnumber() {
        return secondnumber;
    }

    public int getThirdnumber() {
        return thirdnumber;
    }

    public void setFirstnumber(int firstnumber) {
        this.firstnumber = firstnumber;
    }

    public void setSecondnumber(int secondnumber) {
        this.secondnumber = secondnumber;
    }

    public void setThirdnumber(int thirdnumber) {
        this.thirdnumber = thirdnumber;
    }

    public static int minNumber(Number number1) {
        return Math.min(number1.getFirstnumber(), Math.min(number1.getSecondnumber(), number1.getThirdnumber()));

    }
}
