package com.softserve.homework.homework6.task1;

public class Kiwi extends NonFlyingBird {

    public Kiwi(boolean feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.print("and I'm a kiwi.\n");
    }
}
