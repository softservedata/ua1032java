package com.softserve.pract04;

public class MyInt {

    private int numer;

    public MyInt(int numer) {
        this.numer = numer;
    }

    public int getNumer() {
        return numer;
    }

    public MyInt addNum1(MyInt second) {
        return new MyInt(numer + second.numer);
    }

    public MyInt addNum2(MyInt second) {
        numer = numer + second.numer;
        return this;
    }

    @Override
    public String toString() {
        return "MyInt {" +
                " numer = " + numer +
                " }";
    }
}
