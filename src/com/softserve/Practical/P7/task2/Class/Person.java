package com.softserve.Practical.P7.task2.Class;



public abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void print();

}
