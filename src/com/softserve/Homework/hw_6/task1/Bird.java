package com.softserve.Homework.hw_6.task1;

abstract class Bird {
    String feathers;
    boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();
}

class FlyingBird extends Bird {
    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("can fly.");
    }
}

class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("cannot fly.");
    }
}

class Eagle extends FlyingBird {
    public Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
}

class Swallow extends FlyingBird {
    public Swallow(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
}

class Penguin extends NonFlyingBird {
    public Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
}

class Kiwi extends NonFlyingBird {
    public Kiwi(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
}

