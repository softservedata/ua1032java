package hm14;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class task02 {


    public static class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public static Optional<String> mostPopularName(Stream<Employee> employees) {
            Map<String, Long> nameCountMap = employees
                    .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

            Optional<Map.Entry<String, Long>> mostPopularEntry = nameCountMap.entrySet().stream()
                    .max(Comparator.comparingLong(Map.Entry::getValue));

            return mostPopularEntry.map(Map.Entry::getKey);
        }

        public static void main(String[] args) {
            Employee empl1 = new Employee("Bob");
            Employee empl2 = new Employee("Din");
            Employee empl3 = new Employee("Sam");
            Employee empl4 = new Employee("Sam");

            List<Employee> employeeList = Arrays.asList(empl1, empl2, empl3, empl4);

            Optional<String> mostPopularName = mostPopularName(employeeList.stream());

            mostPopularName.ifPresent(name -> System.out.println("Most popular name: " + name));
        }
    }
}
