package com.softserve.lesson06.hw06.task01;

public class Swallow extends FlyingBird {
    @Override
    public void fly() {
        super.fly();
        System.out.println("It is swallow");
    }

    @Override
    public String toString() {
        return "Swallow {" +
                "feathers = " + feathers +
                ", layEggs = " + layEggs +
                '}';
    }
}
