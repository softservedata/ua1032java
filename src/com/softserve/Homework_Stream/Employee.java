package com.softserve.Homework_Stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );

        Optional<String> mostPopularName = mostPopularName(employees.stream());
        mostPopularName.ifPresent(name -> System.out.println("Most popular name: " + name));
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameOccurrences = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        if (nameOccurrences.isEmpty()) {
            return Optional.empty();
        }

        long maxOccurrences = Collections.max(nameOccurrences.values());
        return nameOccurrences.entrySet().stream()
                .filter(entry -> entry.getValue() == maxOccurrences)
                .map(Map.Entry::getKey)
                .findFirst();
    }
}
