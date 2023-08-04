package com.softserve.edu.OOPpart1.homework17;

public class App {
    public static void main(String[] args) {

        System.out.println("Developer information: ");
        Developer developer = new Developer("Volodymyr", 19, 15000.4, "junior Java developer");

        System.out.println(developer);


        System.out.println("Employee information: ");
        Employee employee = new Employee("Viktor", 32, 32735.35);

        System.out.println("\n" + employee);
    }
}
