package hw07_P_1;

import java.util.Comparator;
/** The ReverseAverageSalaryComparator class implements the Comparator interface for the Employee class*/

public class ReverseAverageSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        double Salary1 = e1.calculatePay(); // Calculate the pay for employee e1 using the calculatePay() method
        double Salary2 = e2.calculatePay(); // Calculate the pay for employee e2 using the calculatePay() method
        return Double.compare(Salary2, Salary1); // Compare the salaries in reverse order (descending)
    }
}
