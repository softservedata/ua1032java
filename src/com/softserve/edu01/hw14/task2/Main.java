package com.softserve.edu01.hw14.task2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bob"));
        employees.add(new Employee("Din"));
        employees.add(new Employee("Sam"));
        employees.add(new Employee("Sam"));

        Optional<String> mostPopularName = mostPopularName(employees.stream());
        mostPopularName.ifPresent(name -> System.out.println("Most popular name: " + name));
    }

    private static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCountMap = employees.collect(Collectors.groupingBy(Employee::name, Collectors.counting()));

        return nameCountMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}
