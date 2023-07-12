package com.softserve.HomeWork.HW6.task1.Class;

public class Penguin extends NonFlyingBird{
    public Penguin(Color feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public Penguin() {
        super();
    }

    @Override
    public String toString() {
        return "Penguin" + super.toString();
    }
}

