package com.softserve.Homework.hw_7.task2;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter() {}

    @Override
    public void fly() {
        System.out.println("\tHelicopter is flying");}

    @Override
    public void land() {
        System.out.println("\tHelicopter is landing");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }
}
