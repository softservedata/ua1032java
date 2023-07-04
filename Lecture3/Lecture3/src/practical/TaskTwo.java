package practical;

import java.util.Scanner;

/* Create class called Employee that should consist of:
• three private fields: name, rate and hours;
• a static field called totalSum
• properties to access these fields;
• a default constructor and two constructors with parameters;
Methods:
•getSalary() - to calculate the salary of an employee (formula rate * hours);
• toString() - to output information about the employee;
•getBonuses()–to calculate 10% from salary.
In the main() method create 3 objects of type Employee, input information about them.
Display the total salary of all employees to the console. */

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee e1 = new Employee();
        System.out.println("Enter info about the FIRST employee:");
        System.out.print("Name: ");
        e1.setName(scanner.nextLine());
        System.out.print("Rate: ");
        e1.setRate(scanner.nextDouble());
        System.out.print("Hours: ");
        e1.setHours(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("~~~~~~~~~~~~");

        Employee e2 = new Employee();
        System.out.println("Enter info about the SECOND employee:");
        System.out.print("Name: ");
        e2.setName(scanner.nextLine());
        System.out.print("Rate: ");
        e2.setRate(scanner.nextDouble());
        System.out.print("Hours: ");
        e2.setHours(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("~~~~~~~~~~~~");

        Employee e3 = new Employee();
        System.out.println("Enter info about the THIRD employee:");
        System.out.print("Name: ");
        e3.setName(scanner.nextLine());
        System.out.print("Rate: ");
        e3.setRate(scanner.nextDouble());
        System.out.print("Hours: ");
        e3.setHours(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("~~~~~~~~~~~~");

        scanner.close();

        System.out.println("Employee 1: " + e1);
        System.out.println("Salary: " + e1.getSalary());
        System.out.println("Bonuses: " + e1.getBonuses());

        System.out.println("~~~~~~~~~~~~");

        System.out.println("Employee 2: " + e2);
        System.out.println("Salary: " + e2.getSalary());
        System.out.println("Bonuses: " + e2.getBonuses());

        System.out.println("~~~~~~~~~~~~");

        System.out.println("Employee 3: " + e3);
        System.out.println("Salary: " + e3.getSalary());
        System.out.println("Bonuses: " + e3.getBonuses());

        double totalSalary = e1.getSalary() + e2.getSalary() + e3.getSalary();
        System.out.println("The total salary is: " + totalSalary);
    }
}
