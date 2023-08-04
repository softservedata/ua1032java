package com.softserve.edu.homework.homework_14_Stream_API.task_2;

import java.util.Optional;
import java.util.stream.Stream;

public class Appl {
    public static void main(String[] args) {
        Stream<Employee> employeeStream = Stream.of(
                new Employee("Charlotte"),
                new Employee("Benjamin"),
                new Employee("Amelia"),
                new Employee("Benjamin")
        );
        Optional<String> most_popular_name = Employee.mostPopularName(employeeStream);

        most_popular_name.ifPresentOrElse(
                name -> System.out.println("Most popular name : " + name),
                () -> System.out.println("No popular name found.")
        );
    }
}
