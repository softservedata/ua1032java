package com.softserve.lesson05.hw05.task03;

import java.util.Arrays;

public class Car {
    private String type;
    private int yearProd;
    private double engineCap;

    public Car() {
    }

    public Car(String type, int yearProd, double engineCap) {
        this.type = type;
        this.yearProd = yearProd;
        this.engineCap = engineCap;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearProd() {
        return yearProd;
    }

    public void setYearProd(int yearProd) {
        this.yearProd = yearProd;
    }

    public double getEngineCap() {
        return engineCap;
    }

    public void setEngineCap(double engineCap) {
        this.engineCap = engineCap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (yearProd != car.yearProd) return false;
        if (Double.compare(car.engineCap, engineCap) != 0) return false;
        return type != null ? type.equals(car.type) : car.type == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = type != null ? type.hashCode() : 0;
        result = 31 * result + yearProd;
        temp = Double.doubleToLongBits(engineCap);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Car {" +
                "type= '" + type + '\'' +
                ", yearProd= " + yearProd +
                ", engineCap= " + engineCap +
                '}';
    }

    public static void getModelYearList (int modelYear, Car[] cars) {
        System.out.println("Type of cars for " + modelYear + " model year:");
        for (int i = 0; i < cars.length; i++) {
            if(modelYear == cars[i].yearProd) {
                System.out.println(cars[i].type);
            }
        }
    }

    public static void getYearSortedList (Car[] cars) {
        Car tmp;
        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].yearProd > cars[j].yearProd) {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
        System.out.print(Arrays.toString(cars));
    }
}
