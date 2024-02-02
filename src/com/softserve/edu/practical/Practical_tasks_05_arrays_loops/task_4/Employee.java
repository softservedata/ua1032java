package com.softserve.edu.practical.Practical_tasks_05_arrays_loops.task_4;
import java.lang.Comparable;

public class Employee implements Comparable<Employee> {
    private String name;
    private int department_number;
    private float salary;

    public Employee(String name, int department_number, float salary){
        this.name = name;
        this.department_number = department_number;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartment_number() {
        return department_number;
    }

    public float getSalary() {
        return salary;
    }
    @Override
    public int compareTo(Employee other) {

        return Double.compare(this.getSalary(), other.getSalary());
    }
}
