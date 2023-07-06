package com.softserve.homework.hw06.task1;

public class FlyingBird extends Bird{
    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Is flying");
    }
}
