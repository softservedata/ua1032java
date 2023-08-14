package com.softserve.edu.InterfacesPolymorphism;

public class Helicopter extends FlyingVehicle{
    private int weight;

    private int maxHeight;

    public Helicopter(int weight, int maxHeight, int passengers) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        System.out.println("The helicopter is flying");
    }

    @Override
    public void land() {
        System.out.println("The helicopter is landing");
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
