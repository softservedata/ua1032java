package com.softserve.edu.homework.homework07_OOP_Interfaces_Polymorphism.task_1;
import java.io.IOException;
public class Appl {
    public static void main(String[] args) throws IOException{
        Employee[] empoyees = new Employee[10];
        empoyees[0]= new SalariedEmployee (4565011, "James", 34.5f,210,"123-45-6789");
        empoyees[1]= new ContractEmployee(8573460, "William",4550, "874-00-5935");
        empoyees[2]= new SalariedEmployee(7539239,"Benjamin", 40.55f,90, "856-88-9314");
        empoyees[3]= new SalariedEmployee (9563011, "Isabella", 23.1f,260,"567-91-3565");
        empoyees[4]= new ContractEmployee(1665922, "Liam",3900, "912-53-0909");
        empoyees[5]= new SalariedEmployee(3527104,"Noah", 30,180, "121-33-4531");
        empoyees[6]= new SalariedEmployee (9984535, "Oliver", 18.9f,200,"454-30-0978");
        empoyees[7]= new ContractEmployee(2419430, "Elijah",2100, "302-71-1782");
        empoyees[8]= new SalariedEmployee(6392013,"Emma", 26.7f,260, "724-41-5655");
        empoyees[9]= new ContractEmployee (5563823, "Lucas", 4100,"059-31-6722");

        Employee change;
        for (int i = 0; i < empoyees.length;i++){
            for(int j = 0; j < empoyees.length;j++){
                if(empoyees[i].calculatePay()>empoyees[j].calculatePay()){
                    change = empoyees[i];
                    empoyees[i] = empoyees[j];
                    empoyees[j] = change;
                }
            }
        }
        System.out.println("All employees are sorted :\n");

        for(Employee employee : empoyees){
            System.out.println("[ Employee ID : " + employee.employeeId + ";  Name : "+ employee.name + ";  Average monthly salary : "+ employee.calculatePay()+" ]");
        }
    }
}
