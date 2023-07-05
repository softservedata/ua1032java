package com.softserve.homework.hw06.task1;

public class Penguin extends NonFlyingBird {

    public Penguin() {
        super(true, true);
    }

    @Override
    public String toString() {
        return "Penguin{fly=" + fly() + "; feathers=" + isFeathers() + "; layEggs=" + isLayEggs() + "}";
    }
}