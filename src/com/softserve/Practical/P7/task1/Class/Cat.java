package com.softserve.Practical.P7.task1.Class;

public class Cat implements Animals {

    @Override
    public void voice() {
        System.out.println("Meow meow");
    }

    @Override
    public void feed() {
        System.out.println("I like milk");
    }
}
