package com.softserve.homework.homework14.task1;

import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Homework14_01 {
    // TODO: Create class Product with fields manufacture category, date of manufacture and price. Add all needed methods
    //      - Create list Product with 20 objects
    //      - Obtain a sorted by the price list of products belong to category Phone with
    //      price > 3000, and the date of manufacture was more then 1 year ago.
    //      - Realize method

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Year currentYear = Year.now();
        products.add(new Product("Phone", 1, 11, 2022, 1000.00));
        products.add(new Product("Phone", 2, 2, 2023, 3000.00));
        products.add(new Product("Phone", 3, 6, 2023, 2000.00));
        products.add(new Product("Phone", 4, 2, 2021, 6000.00));
        products.add(new Product("Phone", 5, 4, 2022, 4000.00));
        products.add(new Product("Phone", 6, 8, 2023, 6000.00));
        products.add(new Product("Book", 7, 1, 2023, 700.00));
        products.add(new Product("Computer", 8, 8, 2019, 800.00));
        products.add(new Product("TV", 9, 9, 2021, 900.00));
        products.add(new Product("Shoes", 10, 10, 2023, 1000.00));
        products.add(new Product("Clothes", 11, 11, 2023, 1100.00));
        products.add(new Product("Food", 12, 12, 2022, 1200.00));
        products.add(new Product("Car", 13, 11, 2021, 13000.00));
        products.add(new Product("House", 14, 6, 2019, 140000.00));
        products.add(new Product("Vacation", 15, 4, 2000, 150000.00));
        products.add(new Product("Investment", 16, 12, 2018, 1600000.00));

        List<Product> sortedProducts = products.stream().sorted()
                .filter(product -> product.getCategory().equals("Phone") && product.getPrice() > 3000)
                .filter(product -> product.getDayOfManufacture().getYear() < (currentYear.getValue()))
                .sorted(Comparator.comparing(Product::getPrice))
                .toList();

        System.out.println("Sorted list:\n" + sortedProducts);

        Stream<Employee> employees = Stream.of(
                new Employee("Taras"),
                new Employee("Ivan"),
                new Employee("Ivan"),
                new Employee("John")
        );
        System.out.println("Most popular name is " + mostPopularName(employees).orElse("All names are unique!"));
    }
}
