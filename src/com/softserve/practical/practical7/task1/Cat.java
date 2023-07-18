package com.softserve.practical.practical7.task1;

public class Cat implements Animal {


    @Override
    public void voice() {
        System.out.println("\tMeow!");
    }

    @Override
    public void feed() {
        System.out.println("\tThe cat is fed!");
    }

    @Override
    public String toString() {
        return "[Cat]";
    }
}
