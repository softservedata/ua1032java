package com.softserve.homework.hw06.task1;

abstract class Bird {
    //feathers and layEggs and an abstaract fly() method.
    private boolean feathers;
    private boolean layEggs;

    protected abstract boolean fly();{
    }

    public Bird ( ) {
    }

    public Bird ( boolean feathers, boolean layEggs ) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public boolean isFeathers () {
        return feathers;
    }

    public void setFeathers ( boolean feathers ) {
        this.feathers = feathers;
    }

    public boolean isLayEggs () {
        return layEggs;
    }

    public void setLayEggs ( boolean layEggs ) {
        this.layEggs = layEggs;
    }
}











