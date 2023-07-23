package com.softserve.practical.practical8.task1;

public class Department implements Cloneable {
    private String name;
    private Address address;

    public static class Address implements Cloneable {
        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public void setCity(String city) {
            this.city = city;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public Department(String name, String city, String street, int building) {
        this.name = name;
        address = new Address(city, street, building);
    }

    public void setCity(String city) {
        address.setCity(city);
    }

    @Override
    public String toString() {
        return "[" + name + "]" +
                "\nAddress:\n\tCity: " + address.city +
                "\n\tStreet: " + address.street +
                "\n\tBuilding: " + address.building + "\n";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department clone = (Department) super.clone();
        clone.address = (Address) clone.address.clone();
        return clone;
    }
}
