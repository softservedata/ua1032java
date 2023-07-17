package firstHomework;

import java.util.Arrays;
import java.util.Comparator;

public class TestFirstHomeworkTask {
    public static void main(String[] args) {
        Employee[] employees= new Employee[5];
        employees[0] = new SalariedEmployee("1", "123-45-6789", 5000.0);
        employees[1] = new ContractEmployee("2", "987-65-4321", 25.0, 160);
        employees[2] = new SalariedEmployee("3", "132-32-2132", 4000.0);
        employees[3] = new ContractEmployee("4", "321-98-7654", 20.0, 180);
        employees[4] = new ContractEmployee("5", "456-78-9012", 22.5, 200);

        Arrays.sort(employees, Comparator.comparingDouble(Employee::calculatePay).reversed());

        for (Employee employee : employees) {
            String employeeId = employee.getEmployeeId();
            String typeName = employee.getClass().getSimpleName();
            double averageMonthlyWage = employee.calculatePay();

            System.out.println("Employee ID: " + employeeId);
            System.out.println("Name: " + typeName);
            System.out.println("Average Monthly Wage: $" + averageMonthlyWage);
            System.out.println();
        }
    }
}
