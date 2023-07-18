package com.softserve.homework.homework7.task2;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter() {}

    @Override
    void fly() {
        System.out.println("\tI'm flying!");
    }

    @Override
    void land() {
        System.out.println("\tI landed!");
    }
}
