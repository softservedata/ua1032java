package com.softserve.hw05.Task01;

public class Eagle extends FlyingBird{
    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public boolean fly() {
        return true;
    }
}
