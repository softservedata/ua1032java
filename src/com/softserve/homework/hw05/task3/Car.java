package com.softserve.homework.hw05.task3;


class Car {
    private String type;
    private int productionYear;
    private double engineVolume;


    public Car (  ) {

    }

    public Car(String type, int productionYear, double engineVolume) {
        this.type = type;
        this.productionYear = productionYear;
        this.engineVolume = engineVolume;
    }

    public String getType () {
        return type;
    }

    public void setType ( String type ) {
        this.type = type;
    }

    public void setProductionYear ( int productionYear ) {
        this.productionYear = productionYear;
    }

    public double getEngineVolume () {
        return engineVolume;
    }

    public void setEngineVolume ( double engineVolume ) {
        this.engineVolume = engineVolume;
    }

    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", productionYear=" + productionYear +
                ", engineVolume=" + engineVolume +
                '}';
    }
}