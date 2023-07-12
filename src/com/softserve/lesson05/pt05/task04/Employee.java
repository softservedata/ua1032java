package com.softserve.lesson05.pt05.task04;

public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (departmentNumber != employee.departmentNumber) return false;
        if (salary != employee.salary) return false;
        return name != null ? name.equals(employee.name) : employee.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + departmentNumber;
        result = 31 * result + salary;
        return result;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "name= '" + name + '\'' +
                ", departmentNumber= " + departmentNumber +
                ", salary= " + salary +
                '}';
    }

    public static void getDepartmentEmployees (int departNum, Employee[] employees) {
        System.out.println("Names of employees from department " + departNum + ":");
        for (int i = 0; i < employees.length; i++) {
            if(departNum == employees[i].departmentNumber) {
                System.out.println(employees[i].name);
            }
        }
    }

    public static void getSalarySortedList (Employee[] employees) {
        Employee tmp;
        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].salary < employees[j].salary) {
                    tmp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tmp;
                }
            }
        }

        for (int i = 0; i < employees.length; i++) {
            System.out.print(employees[i].name + " ");
        }
    }
}
