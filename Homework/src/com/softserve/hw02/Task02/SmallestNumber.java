package com.softserve.hw02.Task02;

public class SmallestNumber {
    private int a;
    private int b;
    private int c;

    public SmallestNumber(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int TheSmallestNumber(){
        if(a < b && a < c){
            return a;
        } else if(b < a && b < c){
            return b;
        } else {
            return c;
        }
    }
}
