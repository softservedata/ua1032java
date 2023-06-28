package practical.lesson3.task2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Employee emp1 = new Employee();
        emp1.setName("Ivan Ivanov");
        emp1.setHours(8);
        emp1.setRate(5);
        System.out.println(emp1.toString() + " Salary: " + emp1.getSalary() + ", Bonuses: " + emp1.getBonuses());
        Employee.totalSum += emp1.getSalary();

        Employee emp2 = new Employee("Vasyl Vasylyk", 12, 2);
        System.out.println(emp2.toString() + " Salary: " + emp2.getSalary() + ", Bonuses: " + emp2.getBonuses());
        Employee.totalSum+= emp2.getSalary();

        Employee emp3 = new Employee( 10, 3);
        emp3.setName("Petro Petrenko");
        System.out.println(emp3.toString() + " Salary: " + emp3.getSalary() + ", Bonuses: " + emp3.getBonuses());
        Employee.totalSum+= emp3.getSalary();

        System.out.println("Total salary sum = " + Employee.totalSum);

    }
}
