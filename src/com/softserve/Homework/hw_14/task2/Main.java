package com.softserve.Homework.hw_14.task2;
import java.util.Optional;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        Stream<Employee> employeeStream = Stream.of(
          new Employee ("John"),
          new Employee("Tony"),
          new Employee("Emily"),
          new Employee ("Tony")
        );
        Optional<String> mostPopularName = Employee.mostPopularName(employeeStream);
        System.out.println("The most popular name is " + mostPopularName.orElse("No data"));
    }
}
