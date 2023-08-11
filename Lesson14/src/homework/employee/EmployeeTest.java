package homework.employee;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeTest {
    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> mostPopularName = employees.collect(Collectors.groupingBy(Employee::getName,
                Collectors.counting()));
        return mostPopularName.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey);
    }

    public static void main(String[] args) {
        Stream<Employee> employeeStream = Stream.of(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );
        System.out.println("Most popular name is " + mostPopularName(employeeStream).orElse("All names are unique!"));
    }
}
