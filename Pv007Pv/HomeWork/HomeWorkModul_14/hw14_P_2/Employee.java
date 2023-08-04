package hw14_P_2;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 2. For given a stream with objects of Employee class, return the optional, containing the most
 * popular name. If this stream is empty, Optional.empty should be returned. For example:
 * empl1.name = “Bob”, empl2.name = “Din”,
 * empl3.name = “Sam”, empl4.name = “Sam”
 * “Sam” should be returned.
 */

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // Creating objects of the Employee class
        Employee empl1 = new Employee("Bob");
        Employee empl2 = new Employee("Din");
        Employee empl3 = new Employee("Sam");
        Employee empl4 = new Employee("Sam");

        // Creating a list of employees
        List<Employee> employees = Arrays.asList(empl1, empl2, empl3, empl4);

        // Finding the most popular name
        Optional<String> mostPopularName = findMostPopularName(employees);

        // Printing the result
        mostPopularName.ifPresent(name -> System.out.println("Most popular name: " + name));
    }

    public static Optional<String> findMostPopularName(List<Employee> employees) {
        // Grouping employees by name and counting the occurrences of each name
        Map<String, Long> nameCountMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        // Finding the maximum count of occurrences
        Optional<Long> maxCount = nameCountMap.values().stream()
                .max(Long::compareTo);

        // Returning an Optional with the name(s) having the maximum count of occurrences
        return maxCount.flatMap(count -> nameCountMap.entrySet().stream()
                .filter(entry -> entry.getValue().equals(count))
                .map(Map.Entry::getKey)
                .findFirst());
    }
}


