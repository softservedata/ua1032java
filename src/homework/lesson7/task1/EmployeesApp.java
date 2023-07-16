package homework.lesson7.task1;

import java.util.Arrays;

public class EmployeesApp {
    public static void main(String[] args) {
        Employee [] employees = new Employee[5];
        employees[0] = new SalariedEmployee("100s","Ken","DM34U987", 96, 5.9f);
        employees[1] = new ContractEmployee("100c", "John", 1000f ,"107-87-23" );
        employees[2] = new SalariedEmployee("101s", "Jack","DF56O023", 144, 2.5f);
        employees[3] = new ContractEmployee("101c", "Michael",7550f ,"523-94-27" );
        employees[4] = new SalariedEmployee("102s", "Franklin","UM14P472", 120, 3.8f);

        for (int i = 0; i < employees.length; i++){
            employees[i].calculatePay();
        }
        Arrays.sort(employees);

        System.out.println(Arrays.toString(employees));

    }
}
