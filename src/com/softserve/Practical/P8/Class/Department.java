package com.softserve.Practical.P8.Class;

import java.nio.channels.ClosedSelectorException;

public class Department implements Cloneable {
    String name;
    Address address;
    public static class Address{
        String city;
        String street;
        int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }
        public Address(Address other) {
            this.city = other.city;
            this.street = other.street;
            this.building = other.building;
        }

        @Override
        public String toString() {
            return "\tCity: " + city + ", \n\tStreet: " + street + ", \n\tBuilding: " + building;
        }

        public String getCity() {
            return city;
        }
        public String getStreet() {
            return street;
        }
        public int getBuilding() {
            return building;
        }

    }

    public Department(String name,String city, String street, int building) {
        this.name = name;
        address = new Address(city,street,building);
    }
    @Override
    public String toString(){
        return "Name: " + name + "\nAddress: \n" + address;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        Department clonedDepartment = (Department) super.clone();
        clonedDepartment.address = new Address(this.address);
        return clonedDepartment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public void setStreet(String street) {
        address.street = street;
    }
    public void setBuilding(int building) {
        address.building = building;
    }
    public void setCity(String city) {
        address.city = city;
    }

}
