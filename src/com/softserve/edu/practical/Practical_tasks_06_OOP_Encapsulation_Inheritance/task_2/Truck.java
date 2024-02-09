package com.softserve.edu.practical.Practical_tasks_06_OOP_Encapsulation_Inheritance.task_2;

public class Truck extends Car{
    private int payloadCapacity;
    public Truck(String model, float maxSpeed, int yearOfProduction, int payloadCapacity) {
        super(model, maxSpeed, yearOfProduction);
        this.payloadCapacity = payloadCapacity;
    }
    @Override
    public void run(){
        System.out.println("Truck is running.");
    }
    @Override
    public void stop() {
        System.out.println("Truck has stopped.");
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Payload Capacity: " + payloadCapacity);
    }
}
