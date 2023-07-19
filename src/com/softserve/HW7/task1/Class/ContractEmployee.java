package com.softserve.HW7.task1.Class;

public class ContractEmployee extends Employee implements Payment{
    private double salary;
    private int hours;
    private String federalTaxIdmember;
    @Override
    public double calculatePay() {
        return salary * hours;
    }

    public ContractEmployee(String name, String employeeld, double salary, int hours, String federalTaxIdmember) {
        super(name,employeeld);
        this.salary = salary;
        this.hours = hours;
        this.federalTaxIdmember = federalTaxIdmember;
        super.paid = calculatePay();
    }

    public double getSalary() {
        return salary;
    }

    public int getHours() {
        return hours;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    @Override
    public String toString() {
        return "\n\t\tContractEmployee{" +
                super.toString() +
                "salary=" + salary +
                ", hours=" + hours +
                ", federalTaxIdmember='" + federalTaxIdmember + '\'' +
                '}';
    }
    @Override
    public int compareTo(Employee o) {
        return -(int) (getPaid() - o.getPaid());
    }
}
