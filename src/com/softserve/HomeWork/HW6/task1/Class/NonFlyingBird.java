package com.softserve.HomeWork.HW6.task1.Class;

public  class NonFlyingBird extends Bird {
    public NonFlyingBird(Color feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public NonFlyingBird() {
        super();
    }

    @Override
    public String fly() {
        return "I can't fly";
    }

}
