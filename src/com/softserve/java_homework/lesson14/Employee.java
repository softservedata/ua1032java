package com.softserve.java_homework.lesson14;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    private String name;

    public static void main(String[] args) {
        Stream<Employee> employees = Stream.of(
                new Employee("Mathias"),
                new Employee("Elias"),
                new Employee("Thomas"),
                new Employee("Elias"),
                new Employee("Tobias"),
                new Employee("Louis"),
                new Employee("Augustin"));

        Optional<String> mostPopularName = mostPopularName(employees);
        mostPopularName.ifPresent(name -> System.out.println("Most popular name: " + name));
    }

    public Employee(String name) {
        this.name = name;
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameOccurrences = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        return nameOccurrences.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "name = "
                + getName() + " }";
    }
}
