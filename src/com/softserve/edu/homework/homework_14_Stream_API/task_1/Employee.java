package com.softserve.edu.homework.homework_14_Stream_API.task_1;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    private String name;

    public Employee(String name){
        this.name = name;
    }
    public String getName() { return name; }

    public static Optional<String> mostPopularName() {
        Stream<Employee> employeeStream = Stream.of(
                new Employee("William"),
                new Employee("Liam"),
                new Employee("Noah"),
                new Employee("William"),
                new Employee("James"),
                new Employee("Henry")
        );
        Map<String, Long> nameMap = employeeStream
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        Optional<Map.Entry<String,Long>> mostPopularName = nameMap.entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue());
        return mostPopularName.map(Map.Entry::getKey);
    }
}
