package com.softserve.hw.lesson5.task3;

import java.util.Comparator;
import java.util.Scanner;

public class Car implements Comparator {
    private String type;
    private int ear;
    private int powerEngine;

    public Car(String type, int ear, int powerEngine) {
        this.type = type;
        this.ear = ear;
        this.powerEngine = powerEngine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEar() {
        return ear;
    }

    public void setEar(int ear) {
        this.ear = ear;
    }

    public int getPowerEngine() {
        return powerEngine;
    }

    public void setPowerEngine(int powerEngine) {
        this.powerEngine = powerEngine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", ear=" + ear +
                ", powerEngine=" + powerEngine +
                '}';
    }

    public static Car seekEar(Car[] array) {
        System.out.println("Please input ear car: ");
        int ear = new Scanner(System.in).nextInt();
        for (Car car : array) {
            if (car.getEar() == ear) {
                return car;
            }
        }
        return null;
    }
    public static void sort(Car[] array) {

    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
