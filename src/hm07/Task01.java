package hm07;

import java.util.Arrays;
import java.util.Comparator;

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

    public abstract double calculatePay();
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
    private String federalTaxIdMember;
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String employeeId, String federalTaxIdMember, double hourlyRate, int hoursWorked) {
        super(employeeId);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("E101", "SSN123", 4000.0),
                new SalariedEmployee("E102", "SSN456", 3500.0),
                new ContractEmployee("E201", "FTID789", 25.0, 160),
                new ContractEmployee("E202", "FTID234", 30.0, 180)
        };


        Arrays.sort(employees, Comparator.comparingDouble(Employee::calculatePay).reversed());

        for (Employee employee : employees) {
            System.out.printf("Employee ID: %s, Name: %s, Average Monthly Wage: %.2f%n",
                    employee.getEmployeeId(), employee.getClass().getSimpleName(), employee.calculatePay());
        }
    }
}
