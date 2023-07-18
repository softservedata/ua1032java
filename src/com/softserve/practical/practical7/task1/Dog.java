package com.softserve.practical.practical7.task1;

public class Dog implements Animal {


    @Override
    public void voice() {
        System.out.println("\tWoof!");
    }

    @Override
    public void feed() {
        System.out.println("\tThe dog is fed!");
    }

    @Override
    public String toString() {
        return "[Dog]";
    }
}
