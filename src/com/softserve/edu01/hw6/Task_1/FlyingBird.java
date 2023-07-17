package com.softserve.edu01.hw6.Task_1;

public abstract class FlyingBird extends Bird {
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void fly() {
        System.out.println("Flying bird is flying...");
    }
}
