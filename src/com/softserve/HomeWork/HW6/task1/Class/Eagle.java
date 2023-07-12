package com.softserve.HomeWork.HW6.task1.Class;

public class Eagle extends FlyingBird {

    public Eagle(Color feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public Eagle() {
        super();
    }

    @Override
    public String toString() {
        return "Eagle" + super.toString();
    }
}
