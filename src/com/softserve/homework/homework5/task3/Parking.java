package com.softserve.homework.homework5.task3;

public class Parking {
    private Car[] cars;

    public Parking() {
        cars = null;
    }
    public Parking(Car[] cars) {
        this.cars = cars;
    }

    public Car[] getCars() {
        return cars;
    }
    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public void sortCarsByYear(){
        Car temp;

        for(int i = 0; i < cars.length - 1; i++){
            for(int j = i + 1; j < cars.length; j++){
                if (cars[i].getYear() < cars[j].getYear()) {
                    temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
    }

    public Car getCertainModel(int inputYear){
        Car temp = null;

        for (Car car : cars) {
            if (car.getYear() == inputYear) {
                System.out.println(car);
                temp = car;
            }
        }

        return temp;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for(Car car: cars){
            str.append(car);
            str.append("\n");
        }

        return str.toString();
    }
}
