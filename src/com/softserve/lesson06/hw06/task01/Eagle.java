package com.softserve.lesson06.hw06.task01;

public class Eagle extends FlyingBird {
    @Override
    public void fly() {
        super.fly();
        System.out.println("It is eagle");
    }

    @Override
    public String toString() {
        return "Eagle {" +
                "feathers = " + feathers +
                ", layEggs = " + layEggs +
                '}';
    }
}
