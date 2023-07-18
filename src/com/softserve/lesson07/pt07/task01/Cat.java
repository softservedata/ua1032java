package com.softserve.lesson07.pt07.task01;

public class Cat implements Animal{

    @Override
    public void voice() {
        System.out.println("Cat goes meow");
    }

    @Override
    public void feed() {
        System.out.println("You have feeding your cat");
    }
}
