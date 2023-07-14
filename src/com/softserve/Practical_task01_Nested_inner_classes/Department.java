package com.softserve.Practical_task01_Nested_inner_classes;

class Department {
    private String name;
    private Address address;

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public Department clone() {
        Address clonedAddress = new Address(address.getCity(), address.getStreet(), address.getBuilding());
        return new Department(name, clonedAddress);
    }

    @Override
    public String toString() {
        return "Department: " + name + "\nAddress: " + address.toString();
    }

    class Address {
        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
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

        @Override
        public String toString() {
            return "City: " + city + "\nStreet: " + street + "\nBuilding: " + building;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of a department
        Department department1 = new Department("Marketing", new Department.Address("New York", "Main Street", 123));

        // Clone the department and change the city
        Department department2 = department1.clone();
        department2.getAddress().city = "Los Angeles";

        // Output information about all departments
        System.out.println("Department 1:");
        System.out.println(department1.toString());
        System.out.println("----------------------------------");
        System.out.println("Department 2:");
        System.out.println(department2.toString());
    }
}