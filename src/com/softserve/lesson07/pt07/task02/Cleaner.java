package com.softserve.lesson07.pt07.task02;

public class Cleaner extends Staff {
    private final String TYPE_PERSON = "Cleaner";

    public Cleaner() {
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.print("I'm a Cleaner");
    }

    @Override
    public void salary() {
        System.out.print("Cleaner salary is 36000$");
    }
}
