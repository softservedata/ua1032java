package com.softserve.HW7.task1.Class;

public class SalariedEmployee extends Employee implements Payment{
    private double paid;
    private String socialSecurityNumber;
    @Override
    public double calculatePay() {
        return paid;
    }

    public SalariedEmployee(String name, String employeeld, double paid, String socialSecurityNumber) {
        super(name,employeeld);
        this.paid = paid;
        this.socialSecurityNumber = socialSecurityNumber;
        super.paid = calculatePay();
    }

    public double getPaid() {
        return paid;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "\n\t\tSalariedEmployee{"+
                super.toString() +
                "paid=" + paid +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return  -(int) (getPaid() - o.getPaid());
    }
}
