package com.softserve.homework.homework6.task1;

public class FlyingBird extends Bird {

    public FlyingBird(boolean feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.print("I'm a flying bird ");
    }
}
