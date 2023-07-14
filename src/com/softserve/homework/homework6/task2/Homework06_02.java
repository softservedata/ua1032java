package com.softserve.homework.homework6.task2;

public class Homework06_02 {
    // TODO: Create a class called Developer that extends the Employee class. Define a String field
    //      and a constructor to initialize all fields in the Developer class.
    //      - In the Developer class, override the report() method to return a string with information
    //      about the developer, for example:
    //      Name: Taras, Age: 32 years, Position: Average Java developer, Salary: 32735.35
    //      - If necessary, modify the Employee class to adhere to the principles of encapsulation and
    //      inheritance.
    //      - In main() method create an instance of both the Employee and Developer classes and
    //      print information about them in the console using report() method.

    public static void main(String[] args) {
        Employee employee = new Employee("Maksym", 18, 24000.0);
        Developer developer = new Developer("Taras", 32, 32735.35, "Average Java developer");

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
