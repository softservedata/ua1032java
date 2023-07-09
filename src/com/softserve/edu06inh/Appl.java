package com.softserve.edu06inh;

public class Appl {

    public static void main(String[] args) {
        /*
        B b = new B();
        b.m1(); // from A, or B if exist in B
        System.out.println("i = " + b.getI());
        b.m2(); // from B
        System.out.println("i = " + b.i); // Architecture Error, use b.getI();
        */
        /*
        Base base = new Base();
        base.m1();
        */
        /*
        int k = 123;
        double d = k;
        System.out.println("k = " + k + "  d = " + d);
        //
        d = 456.789;
        k = (int) d; // explicit type casting
        System.out.println("k = " + k + "  d = " + d);
        */
        B b = new B();
        b.m1();
    }
}
