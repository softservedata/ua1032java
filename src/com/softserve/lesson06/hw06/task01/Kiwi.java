package com.softserve.lesson06.hw06.task01;

public class Kiwi extends NonFlyingBird {
    @Override
    public void fly() {
        super.fly();
        System.out.println("It is kiwi");
    }

    @Override
    public String toString() {
        return "Kiwi {" +
                "feathers = " + feathers +
                ", layEggs = " + layEggs +
                '}';
    }
}
