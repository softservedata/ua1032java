package com.softserve.HomeWork.HW6.task1.Class;

public class Kiwi extends NonFlyingBird {
    public Kiwi(Color feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public Kiwi() {
        super();
    }

    @Override
    public String toString() {
        return "Kiwi" + super.toString();
    }
}
