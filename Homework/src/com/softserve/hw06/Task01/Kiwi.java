package com.softserve.hw06.Task01;

public class Kiwi extends NonFlyingBird{
    public Kiwi(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public boolean fly() {
        return false;
    }
}
