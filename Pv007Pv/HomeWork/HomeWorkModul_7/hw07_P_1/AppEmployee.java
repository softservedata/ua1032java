package hw07_P_1;

import java.util.Arrays;
/** 1. Create an interface called Payment with the method calculatePay(), the base
 abstract class called Employee with a String variable employeeld.
 o Create two classes, SalariedEmployee and ContractEmployee, which
 implement Payment interface and inherit from the base class Employee.
 • Describe hourly-paid workers in the relevant classes (one of the child
 classes), and fixed paid workers in the other.
 • Describe the String variable socialSecurityNumber in the
 SalariedEmployee class .
 • Include a description of federalTaxIdmember variable in the
 ContractEmployee class.
 • The calculation formula for the hourly workers is as follow:
 the average monthly salary = hourly rate * number of hours worked
 • For employees with a fixed salary the formula is simply:
 the average monthly salary = fixed monthly payment
 o In main() method create an array of employees and add the employees
 with different form of payment.
 o Arrange the entire sequence of workers in descending order of the average
 monthly wage. Output the employee ID, name, and the average monthly
 wage for all elements of the list.
 */

public class AppEmployee {
    public static void main(String[] args) {

        // Create an array of employees
        Employee[] employees = new Employee[8];

        // Initialize the employees with different types and information
        employees[0] = new SalariedEmployee("123","Taras",5000,"111-222-456");
        employees[1] = new ContractEmployee("456", "Ivan",35, 165, 789999);
        employees[2] = new SalariedEmployee("354","Oleg",6500,"155-222-456");
        employees[3] = new ContractEmployee("012", "Mary",25, 160, 123456);
        employees[4] = new SalariedEmployee("845","Max",5800,"989-222-456");
        employees[5] = new ContractEmployee("015", "Mask",45, 170, 654321);
        employees[6] = new SalariedEmployee("148","Bill",7000,"456-222-456");
        employees[7] = new ContractEmployee("265", "Steve",30, 175, 555555);

        // Print information about all employees and their monthly wages
        System.out.println("Information about all employees and their wages for the month.");
        for (Employee employee: employees) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Employee ID: " + employee.employeeId);
            System.out.println("Name: " + employee.name);
            System.out.println("Monthly salary: " + employee.calculatePay());
            System.out.println(employee);
            System.out.println();
        }
        // Sorting of employees in descending order of average monthly salary
        Arrays.sort(employees,new ReverseAverageSalaryComparator());

        System.out.println("-------------------------------------------------------");
        System.out.println("Employees in descending order of average monthly salary:");

        // Print sorted employees in order of decreasing average monthly salary
        for (Employee employee: employees) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Employee ID: " + employee.employeeId);
            System.out.println("Name: " + employee.name);
            System.out.println("Monthly salary: " + employee.calculatePay());
            System.out.println(employee);

        }
    }
}
