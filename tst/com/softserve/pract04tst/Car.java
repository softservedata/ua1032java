package com.softserve.pract04tst;

public class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("\tCar method equals(), this = " + this + "  Object = " + o);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return name != null ? name.equals(car.name) : car.name == null;
    }

    @Override
    public int hashCode() {
        //System.out.println("\tCar method hashCode()");
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Car { name = " + name + " }";
    }
}
