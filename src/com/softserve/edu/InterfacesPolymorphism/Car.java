package com.softserve.edu.InterfacesPolymorphism;

public class Car extends GroundVehicle{

    private String model;

    public Car(String model, int passengers) {
        super(passengers);
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("The car is driving");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
