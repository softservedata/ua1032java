package com.softserve.homework.hw06.task1;

public class Eagle extends FlyingBird {
    public Eagle() {
        super(true, true);
    }

    @Override
    public String toString() {
        return "Eagle{fly=" + fly() + "; feathers=" + isFeathers() + "; layEggs=" + isLayEggs() + "}";
    }
}