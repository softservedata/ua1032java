package com.softserve.homework.hw14.task2;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCounts = employees.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        nameCounts.forEach((name, count) -> System.out.println(name + ": " + count));


        return nameCounts.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey);
    }
}
