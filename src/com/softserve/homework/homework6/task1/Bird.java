package com.softserve.homework.homework6.task1;

public abstract class Bird {
    private boolean feathers;
    private int layEggs;

    public Bird(boolean feathers, int layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    @Override
    public String toString() {
        return '[' +
                "feathers = " + feathers +
                ", layEggs = " + layEggs +
                " ]";
    }
}
