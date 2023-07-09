package practical;

/* Create a class called Employee with fields: name, department number, salary.
In main() method create five objects of class Employee. Output results for:
• All employees of a certain department (input department number in the console);
• Arrange workers by the field salary in descending order. */

import java.util.Scanner;

public class Employee {
    private String name;
    private String departmentNumber;
    private int salary;

    public Employee(String name, String departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartmentNumber() {
        return departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartmentNumber(String departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Iryna", "One", 10000);
        Employee e2 = new Employee("Roman", "One", 12000);
        Employee e3 = new Employee("Daria", "Three", 20000);
        Employee e4 = new Employee("Nadia", "Two", 17000);
        Employee e5 = new Employee("Ihor", "Three", 30000);
        Scanner scanner = new Scanner(System.in);

        System.out.println("~Input a department number (one, two or three) and I will output names of employees that are working there: ");
        String dep = scanner.nextLine();

        if (e1.getDepartmentNumber().equalsIgnoreCase(dep)) {
            System.out.println("List of employees that are working in the department: \n" + e1.getName());
        }
        if (e2.getDepartmentNumber().equalsIgnoreCase(dep)) {
            System.out.println("List of employees that are working in the department: \n" + e2.getName());
        }
        if (e3.getDepartmentNumber().equalsIgnoreCase(dep)) {
            System.out.println("List of employees that are working in the department: \n" + e3.getName());
        }
        if (e4.getDepartmentNumber().equalsIgnoreCase(dep)) {
            System.out.println("List of employees that are working in the department: \n" + e4.getName());
        }
        if (e5.getDepartmentNumber().equalsIgnoreCase(dep)) {
            System.out.println("List of employees that are working in the department: \n" + e5.getName());
        }
        if (!e1.getDepartmentNumber().equalsIgnoreCase(dep) &&
                !e2.getDepartmentNumber().equalsIgnoreCase(dep) &&
                !e3.getDepartmentNumber().equalsIgnoreCase(dep) &&
                !e4.getDepartmentNumber().equalsIgnoreCase(dep) &&
                !e5.getDepartmentNumber().equalsIgnoreCase(dep)) {
            System.out.println("No employees are found in the department.");
        }

        salaryDescendingOrder();
    }

    private static void salaryDescendingOrder() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Iryna", "One", 10000);
        employees[1] = new Employee("Roman", "One", 12000);
        employees[2] = new Employee("Daria", "Three", 20000);
        employees[3] = new Employee("Nadia", "Two", 17000);
        employees[4] = new Employee("Ihor", "Three", 30000);

        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - i - 1; j++) {
                if (employees[j].getSalary() < employees[j + 1].getSalary()) {
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted salaries in descending order:");
        for (Employee employee : employees) {
            System.out.println(employee.getSalary());
        }
    }
}