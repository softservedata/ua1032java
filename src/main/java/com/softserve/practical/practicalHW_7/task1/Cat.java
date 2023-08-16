package com.softserve.practical.practicalHW_7.task1;

public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("May");
    }

    @Override
    public void feed() {
        System.out.println("Fish");
    }
}
