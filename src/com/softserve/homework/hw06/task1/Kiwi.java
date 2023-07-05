package com.softserve.homework.hw06.task1;

public class Kiwi extends NonFlyingBird {

    public Kiwi() {
        super(true, true);
    }

    @Override
    public String toString() {
        return "Kiwi{fly=" + fly() + "; feathers=" + isFeathers() + "; layEggs=" + isLayEggs() + "}";
    }
}