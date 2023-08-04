package com.softserve.edu.OOPpart1.homework16;

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
