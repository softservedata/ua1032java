package com.softserve.homework.hw06.task1;

abstract class Bird {
    private String feathers;
    private boolean layEgg;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEgg = layEggs;
    }

    public abstract void fly();

    public boolean canLayEggs() {
        return layEgg;
    }

    public String getFeathers() {
        return feathers;
    }
}
