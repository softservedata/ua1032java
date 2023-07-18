package com.softserve.hw06.Task01;

public class Penguin extends NonFlyingBird{
    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public boolean fly() {
        return false;
    }
}
