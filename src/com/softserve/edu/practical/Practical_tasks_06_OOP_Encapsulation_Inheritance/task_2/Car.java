package com.softserve.edu.practical.Practical_tasks_06_OOP_Encapsulation_Inheritance.task_2;

abstract public class Car {
    private String model;
    private float maxSpeed;
    private int yearOfProduction;

    public Car(String model, float maxSpeed, int yearOfProduction){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }
    public abstract void run();
    public abstract void stop();

    public void printInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Year of Production: " + yearOfProduction);
    }
}
