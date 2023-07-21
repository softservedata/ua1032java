package com.softserve.edu.homework.homework_07_OOP_Interfaces_Polymorphism.task_1;

public class SalariedEmployee extends Employee  {
    float hourly_rate;
    int number_of_hours_worked;
    String socialSecurityNumber;
    SalariedEmployee(int employeeId, String name,float hourly_rate,int number_of_hours_worked, String socialSecurityNumber) {
       super(employeeId,name);
       this.hourly_rate = hourly_rate;
       this.socialSecurityNumber = socialSecurityNumber;
       this.number_of_hours_worked = number_of_hours_worked;
    }
    @Override
    public float calculatePay() {
        return hourly_rate * number_of_hours_worked;
    }

}
