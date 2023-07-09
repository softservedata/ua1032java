package com.softserve.hw05.Task01;

public class Swallow extends FlyingBird{
    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public boolean fly() {
        return true;
    }
}
