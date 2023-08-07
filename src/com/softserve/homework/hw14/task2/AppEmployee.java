package com.softserve.homework.hw14.task2;

import java.util.Optional;
import java.util.stream.Stream;


public class AppEmployee {
    public static void main(String[] args) {
        Stream<Employee> employees = Stream.of(new Employee("Bob"), new Employee("Sam"), new Employee("Din"), new Employee("Sam"));

        // Find the most popular name from the stream
        Optional<String> mostPopularName = Employee.mostPopularName(employees);

        // Print the most popular name
        mostPopularName.ifPresent(System.out::println);
    }
}