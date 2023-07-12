package com.softserve.HomeWork.HW6.task1.Class;

public class FlyingBird extends Bird{
    public FlyingBird(Color feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public FlyingBird() {
        super();
    }
    @Override
    public String fly() {
        return "I can fly";
    }
}
