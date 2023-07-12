package com.softserve.homework.hw07.task2.ground_vehicle;

public class Car extends GroundVehicle {

    private String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }



    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Drive car");
    }
}
