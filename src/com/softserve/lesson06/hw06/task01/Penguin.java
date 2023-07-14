package com.softserve.lesson06.hw06.task01;

public class Penguin extends NonFlyingBird {
    @Override
    public void fly() {
        super.fly();
        System.out.println("It is penguin");
    }

    @Override
    public String toString() {
        return "Penguin {" +
                "feathers = " + feathers +
                ", layEggs = " + layEggs +
                '}';
    }
}
