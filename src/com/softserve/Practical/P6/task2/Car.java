package com.softserve.Practical.P6.task2;

import java.util.Scanner;

public abstract class Car {
    protected String model;
    protected int maxSpeed;
    protected int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }
    public Car(){
        model = "noModel";
        maxSpeed = 0;
        yearOfProduction = 2023;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Model: ");
        model = scanner.nextLine();
        System.out.print("maxSpeed: ");
        maxSpeed = scanner.nextInt();
        System.out.print("yearOfProduction: ");
        yearOfProduction = scanner.nextInt();
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return '{' +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfProduction=" + yearOfProduction +
                '}' ;
    }

    public void run(){};
    public void stop(){};
}
