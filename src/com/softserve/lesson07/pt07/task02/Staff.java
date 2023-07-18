package com.softserve.lesson07.pt07.task02;

public abstract class Staff extends Person {

    @Override
    public void print() {
        System.out.print("I'm a Staff");
    }

    protected abstract void salary();
}
