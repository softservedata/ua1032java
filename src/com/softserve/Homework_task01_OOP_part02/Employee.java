package com.softserve.Homework_task01_OOP_part02;
interface Payment {
    double calculatePay();
}

abstract class Employee {
    private String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}

class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private double fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }
}

class ContractEmployee extends Employee implements Payment {
    private String federalTaxId;
    private double hourlyRate;
    private double hoursWorked;

    public ContractEmployee(String employeeId, String federalTaxId, double hourlyRate, double hoursWorked) {
        super(employeeId);
        this.federalTaxId = federalTaxId;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getFederalTaxId() {
        return federalTaxId;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee("1", "SSN1", 5000);
        employees[1] = new SalariedEmployee("2", "SSN2", 6000);
        employees[2] = new ContractEmployee("3", "FTID1", 20, 160);
        employees[3] = new ContractEmployee("4", "FTID2", 25, 150);

        // Sorting employees in descending order of average monthly wage
        java.util.Arrays.sort(employees, (emp1, emp2) -> {
            double wage1 = emp1 instanceof Payment ? ((Payment) emp1).calculatePay() : 0;
            double wage2 = emp2 instanceof Payment ? ((Payment) emp2).calculatePay() : 0;
            return Double.compare(wage2, wage1);
        });

        // Outputting employee details and average monthly wage
        for (Employee employee : employees) {
            double averageMonthlyWage = employee instanceof Payment ? ((Payment) employee).calculatePay() : 0;
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Average Monthly Wage: " + averageMonthlyWage);
            System.out.println("-----------------------------------------");
        }
    }
}