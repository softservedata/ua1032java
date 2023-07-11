package homeWork_6_OOP_Part_1.task2;



import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Roman", 27,15000);
        Developer developer = new Developer("Taras",25,15500,"Java Developer");
        System.out.println(employee.report());
        System.out.println( developer.report());
    }
}
