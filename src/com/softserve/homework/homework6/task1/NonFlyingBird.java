package com.softserve.homework.homework6.task1;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(boolean feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.print("I'm not a flying bird ");
    }
}
