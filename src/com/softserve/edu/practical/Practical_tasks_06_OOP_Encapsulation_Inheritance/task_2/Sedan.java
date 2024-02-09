package com.softserve.edu.practical.Practical_tasks_06_OOP_Encapsulation_Inheritance.task_2;

public class Sedan extends Car{
    private float dispersal;
    public Sedan(String model, float maxSpeed, int yearOfProduction, float dispersal) {
        super(model, maxSpeed, yearOfProduction);
        this.dispersal = dispersal;
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
        System.out.println("I accelerate to 100 km/h for " + dispersal + " seconds");
    }
}
