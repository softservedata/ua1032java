package homework.lesson6.task2;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Employee emp1 = new Developer("Ivan", 40, 39000.4, "Java Developer");
        Employee emp2 = new Employee("Mykhailo", 20, 35000.90);
        System.out.println(emp1.report());
        System.out.println(emp2.report());
    }


}
