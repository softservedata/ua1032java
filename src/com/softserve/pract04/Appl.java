package com.softserve.pract04;

public class Appl {
    public static void main(String[] args) {
        MyInt i1 = new MyInt(1);
        MyInt i2 = new MyInt(2);
        //
        System.out.println("1. i1 = " + i1);
        System.out.println("   i2 = " + i2);
        //
        i1.addNum1(i2);
        System.out.println("2. i1 = " + i1);
        System.out.println("   i2 = " + i2);
        //
        i1 = i1.addNum1(i2);
        System.out.println("3. i1 = " + i1);
        System.out.println("   i2 = " + i2);
        //
        i1.addNum2(i2);
        System.out.println("4. i1 = " + i1);
        System.out.println("   i2 = " + i2);
        //
    }
}
