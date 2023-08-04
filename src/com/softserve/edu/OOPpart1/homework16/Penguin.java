package com.softserve.edu.OOPpart1.homework16;

public class Penguin extends NonFlyingBird{
    private String birdName = "Penguin";

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
