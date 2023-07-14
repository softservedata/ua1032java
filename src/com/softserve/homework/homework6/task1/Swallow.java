package com.softserve.homework.homework6.task1;

public class Swallow extends FlyingBird {

    public Swallow(boolean feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.print("and I'm a swallow.\n");
    }
}
