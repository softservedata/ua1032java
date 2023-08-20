package homeWork_14_Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    static Optional<String> mostPopularName (Stream<Employee> employeeS){
        Map<String,Long>  names = employeeS.collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
        Optional <Map.Entry<String,Long>> mapOptional = names
                .entrySet().stream().max(Map.Entry.comparingByValue());
        return mapOptional.map(Map.Entry::getKey);
    }

    public static void main(String[] args) {
        Stream <Employee> listOfEmployees = Stream.of(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam"),
                new Employee("Bobby")
        );


        System.out.println(mostPopularName(listOfEmployees));

    }

}
