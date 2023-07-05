package com.softserve.HomeWork.HW5.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {
    TypeOfCar type;
    int year;
    double engineСapacity;

    public Car(TypeOfCar type, int year, double engineСapacity) {
        this.type = type;
        this.year = year;
        this.engineСapacity = engineСapacity;
    }
    public Car(){
        type = TypeOfCar.SEDAN;
        year = 2023;
        engineСapacity = 0.0;
    }
    public void input()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        type = TypeOfCar.input();
        System.out.println("Year: ");
        year = Integer.parseInt(br.readLine());
        System.out.println("engineСapacity: ");
        engineСapacity = Double.parseDouble(br.readLine());
    }

    public TypeOfCar getType() {
        return type;
    }

    public void setType(TypeOfCar type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngineСapacity() {
        return engineСapacity;
    }

    public void setEngineСapacity(double engineСapacity) {
        this.engineСapacity = engineСapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", year=" + year +
                ", engineСapacity=" + engineСapacity +
                '}';
    }
}

