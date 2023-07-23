package com.softserve.practical.practical8.task1;

public class Practical08_01 {
    // TODO: Create a class called Department that contains a name field of String type and an address
    //      field of Address type.
    //      - In the Department class, create an inner class called Address with has city and street
    //      fields of String type and building field of type int.
    //      - In main() method, create an instance for one department and initialize it.
    //      - Then, create one more department by cloning previously created department and change
    //      the city for this object.
    //      - Output information about all departments to the console.

    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department("Timberland", "New York", "W 34th St.", 28);
        Department cloneDepartment = (Department) department.clone();

        cloneDepartment.setCity("San Francisco");

        System.out.println(department);
        System.out.println(cloneDepartment);
    }
}
