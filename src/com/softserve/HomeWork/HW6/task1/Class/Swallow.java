package com.softserve.HomeWork.HW6.task1.Class;

public class Swallow extends FlyingBird {
    public Swallow(Color feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public Swallow() {
        super();
    }

    @Override
    public String toString() {
        return "Swallow" + super.toString();
    }
}
