package com.softserve.edu.homework.homework7_OOP_Interfaces_Polymorphism.task_1;

public class ContractEmployee extends Employee {
    float fixed_paid;
    String federalTaxIdmember;
    ContractEmployee(int employeeId, String name, float fixed_paid,String federalTaxIdmember) {
        super(employeeId, name);
        this.fixed_paid = fixed_paid;
        this.federalTaxIdmember = federalTaxIdmember;
    }
    @Override
    public float calculatePay() {
        return fixed_paid;
    }
}
