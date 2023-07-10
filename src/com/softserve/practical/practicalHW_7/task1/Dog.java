package com.softserve.practical.practicalHW_7.task1;

public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("Guf");
    }

    @Override
    public void feed() {
        System.out.println("Meat");
    }
}
