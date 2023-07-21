package com.softserve.Practical.P7.task1.Class;

public class Dog implements Animals {
    @Override
    public void voice() {
        System.out.println("Woof woof");
    }

    @Override
    public void feed() {
        System.out.println("I like bone");
    }
}
