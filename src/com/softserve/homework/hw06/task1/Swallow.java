package com.softserve.homework.hw06.task1;

public class Swallow extends FlyingBird {
    public Swallow() {
        super(true, true);
    }

    @Override
    public String toString() {
        return "Swallow{fly=" + fly() + "; feathers=" + isFeathers() + "; layEggs=" + isLayEggs() + "}";
    }
}