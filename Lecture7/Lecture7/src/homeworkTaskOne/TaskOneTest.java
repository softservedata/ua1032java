package homeworkTaskOne;

/* Create an interface called Payment with the method calculatePay(),
the base abstract class called Employee with a String variable employeeId.
• Create two classes, SalariedEmployee and ContractEmployee, which implement Payment interface
and inherit from the base class Employee.
• Describe hourly-paid workers in the relevant classes (one of the child classes),
 and fixed paid workers in the other.
• Describe the String variable socialSecurityNumber in the SalariedEmployee class.
•Include a description of federalTaxIdMember variable in the ContractEmployee class.

The calculation formula for the hourly workers is:
the average monthly salary = hourly rate * number of hours worked

• For employees with a fixed salary the formula is simply:
the average monthly salary = fixed monthly payment

•  In main() method create an array of employees and add the employees with different form of payment.
•  Arrange the entire sequence of workers in descending order of the average monthly wage.
 Output the employee ID, name, and the average monthly wage for all elements of the list. */

import java.util.Arrays;
import java.util.Comparator;

public class TaskOneTest {
    public static void main(String[] args) {
        Employee[] emps = new Employee[4];
        emps[0] = new  ContractEmployee("EMPLOYEE1", "Iryna", "11111111",  44, 200);
        emps[1] = new  ContractEmployee("EMPLOYEE2", "Roman", "22222222", 50, 210);
        emps[2] = new SalariedEmployee("EMPLOYEE3", "Daria","33333333", 9000);
        emps[3] = new SalariedEmployee("EMPLOYEE4", "Ihor", "44444444", 10200);
        Arrays.sort(emps, Comparator.comparingDouble(Employee::calculatePay).reversed());
        for (Employee employee : emps) {
            System.out.println("The employee name is : " + employee.getName());
            System.out.println("The employee Id is : " + employee.getEmployeeId());
            System.out.println("The average wage is : " + employee.calculatePay());
            System.out.println();
        }
    }
}
