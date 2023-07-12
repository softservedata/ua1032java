package com.softserve.pract08;

import java.lang.reflect.Array;
import java.util.Arrays;

abstract class A implements Comparable<A> {

    public abstract int getId();

//    @Override
//    public int compareTo(A a1) {
//        return getId() - a1.getId();
//    }

    @Override
    public String toString() {
        return "\nThis is class: " + this.getClass().getName() + "  id = " + getId() + "\t";
    }
}

class B extends A {

    @Override
    public int getId() {
        return 5;
    }

    @Override
    public int compareTo(A a1) {
        return getId() - a1.getId();
    }
}

class C extends A {

    @Override
    public int getId() {
        return 10;
    }

    @Override
    public int compareTo(A a1) {
        return getId() - a1.getId();
    }
}

public class AppComp {
    public static void main(String[] args) {
        A[] arr = { new B(), new C(), new B()};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
