package com.softserve.edu06inh;

public class B extends A {

    public B() {
        i = 123;
        System.out.println("\tconstructor public B()");
    }

    @Override
    public void m1() {
        System.out.println("class B method m1()");
        super.m1();
    }

    public void m2() {
        System.out.println("class B method m2()");
        i = 1;
    }

}
