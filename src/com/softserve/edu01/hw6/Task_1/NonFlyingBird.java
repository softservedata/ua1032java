package com.softserve.edu01.hw6.Task_1;

public abstract class NonFlyingBird extends Bird {
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void fly() {
        System.out.println("Bird cannot fly.");
    }
}