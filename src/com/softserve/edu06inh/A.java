package com.softserve.edu06inh;

public class A extends Base {
    //private int i;
    protected int i;

    public A() {
        i = 123;
        System.out.println("\t\tconstructor public A()");
    }

    public A(int i) {
        this.i = i;
        System.out.println("\t\tconstructor public A(int i)");
    }

    public int getI() {
        return i;
    }

    public void m1() {
        System.out.println("class A method m1()");
        super.m1();
    }
}
