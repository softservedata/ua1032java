package hw06_P_2;

/**
 * Class representing an employee.
 */
public class Employee {
    private String name; // Employee's name
    private int age; // Employee's age
    private double salary; // Employee's salary

    //Constructor for the Employee class.
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //Method to get the employee's name.
    public String getName() {
        return name;
    }

    //Method to set the employee's name.
    public void setName(String name) {
        this.name = name;
    }

    //Method to get the employee's age.
    public int getAge() {
        return age;
    }

    //Method to set the employee's age.
    public void setAge(int age) {
        this.age = age;
    }

    //Method to get the employee's salary.
     public double getSalary() {
        return salary;
    }

    //Method to set the employee's salary.
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Method to generate a report with the employee's information.

    public String report() {
        return String.format("Name: %s, Age: %d, Salary: \u20B4 %.2f", name, age, salary);
    }
}
