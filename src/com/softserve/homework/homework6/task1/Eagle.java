package com.softserve.homework.homework6.task1;

public class Eagle extends FlyingBird {

    public Eagle(boolean feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.print("and I'm an eagle.\n");
    }
}
