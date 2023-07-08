/*package practical;

/* Create a class called Employee with fields: name, department number, salary.
In main() method create five objects of class Employee. Output results for:
• All employees of a certain department (input department number in the console);
• Arrange workers by the field salary in descending order. 

import java.util.Scanner;

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

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Iryna", 1, 10000);
        Employee e2 = new Employee("Roman", 1, 12000);
        Employee e3 = new Employee("Daria", 2, 20000);
        Employee e4 = new Employee("Nadia", 3, 17000);
        Employee e5 = new Employee("Ihor", 2, 30000);
    }

    private static void certainDepEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a department number (1, 2 or 3):");
        int dep = scanner.nextInt();


    }
} */