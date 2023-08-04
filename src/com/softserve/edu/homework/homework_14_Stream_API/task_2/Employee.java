package com.softserve.edu.homework.homework_14_Stream_API.task_2;

import java.util.Map;
import java.util.Optional;
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

    public static Optional<String> mostPopularName(Stream<Employee> employeeStream) {
        Map<String, Long> mapPopular = employeeStream
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
        Optional<Map.Entry<String, Long>> mostPopular = mapPopular.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        boolean allUniqueNames = mapPopular.values().stream().allMatch(count -> count == 1);

        if (allUniqueNames) {
            return Optional.empty();
        }
        return mostPopular.map(Map.Entry::getKey);
    }
}
