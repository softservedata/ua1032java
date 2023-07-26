package com.softserve.edu.hw6;

public class Swallow extends FlyingBird{
    private String birdName = "Swallow";

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
