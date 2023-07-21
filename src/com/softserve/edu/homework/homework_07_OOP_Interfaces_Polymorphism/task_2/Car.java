package com.softserve.edu.homework.homework_07_OOP_Interfaces_Polymorphism.task_2;

public class Car extends GroundVehicle{
    String model;
    Car(int passengers, String model){
    super(passengers);
    this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setModel(){
        this.model = model;
    }
    @Override
    public void drive(){
        System.out.println("i go by car");
    }
    @Override
    public String toString(){
        return "Car { Passengers : "+getPassengers() + ";  Model : "+ model +" }";
    }
}
