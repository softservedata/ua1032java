package com.softserve.edu.hw6;

public class Eagle extends FlyingBird{
    private String birdName = "Eagle";
    @Override
    public String toString() {
        return "Bird{" +
                "birdName='" + birdName + '\'' +
                ", layEggs=" + isLayEggs() +
                ", isPredator=" + isPredator() +
                ", feather='" + getFeather() + '\'' +
                ", gender='" + getGender() + '\'' +
                '}';
    }
}
