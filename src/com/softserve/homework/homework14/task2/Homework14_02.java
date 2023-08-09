package com.softserve.homework.homework14.task2;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Homework14_02 {
    // TODO: For given a stream with objects of Employee class, return the optional, containing the most popular name. If this stream is empty, Optional.empty should be returned. For example:
    //       empl1.name = “Bob”, empl2.name = “Din”,
    //       empl3.name = “Sam”, empl4.name = “Sam”
    //      “Sam” should be returned.

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        boolean unique;
        Map<String, Long> names = employees.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
        Optional<Map.Entry<String, Long>> temp = names
                .entrySet().stream()
                .max(Map.Entry.comparingByValue());

        unique = names.values().stream().allMatch(i -> i == 1);

        if(unique) return Optional.empty();
        else return temp.map(Map.Entry::getKey);
    }

    public static void main(String[] args) {
        Stream<Employee> employees = Stream.of(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );
        Optional<String> mostPopularName = mostPopularName(employees);

        mostPopularName.ifPresentOrElse(name -> System.out.println("Most popular name is \"" + name + "\"."),
                () -> System.out.println("All names are unique!"));
    }
}
