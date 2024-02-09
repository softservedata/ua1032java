package com.softserve.edu.practical.Practical_tasks_08_Nested_Inner_classes;

public class Appl {
    public static void main(String[] args) throws CloneNotSupportedException {

        Department.Address address = new Department.Address("Lviv","Lvivsyka");
        Department.Address addressCopy =  (Department.Address) address.clone();
        addressCopy.city = "Dnipro";

        System.out.println(address);
        System.out.println(addressCopy);
    }
}
