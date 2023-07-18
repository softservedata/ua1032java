package com.softserve.lesson07.pt07.task01;

public class Dog implements Animal{

    @Override
    public void voice() {
        System.out.println("Dog goes woof");
    }

    @Override
    public void feed() {
        System.out.println("You are feeding your dog");
    }
}
