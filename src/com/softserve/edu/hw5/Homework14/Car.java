package com.softserve.edu.hw5.Homework14;

public class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    Car(String type, int yearOfProduction, double engineCapacity){
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }
    public int getYear(){
        return yearOfProduction;
    }




    @Override
    public String toString() {
        return "Car[" +
                "type = '" + type + '\'' +
                ", yearOfProduction = " + yearOfProduction +
                ", engineCapacity = " + engineCapacity +
                ']';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){ //check hashcode of two objects
            return true;
        }
        if((obj == null) || (getClass() != obj.getClass())) { //(if object does not exist (null)) or (objects don't have the same class)
            return false;
        }
        Car other = (Car) obj;

        if(type.equals(other.type) &&
                engineCapacity == other.engineCapacity &&
                other.yearOfProduction == yearOfProduction) {
            return true;
        }
        return false;

    }

}
