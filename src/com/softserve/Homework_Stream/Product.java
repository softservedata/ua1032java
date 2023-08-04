package com.softserve.Homework_Stream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {
    private String manufactureCategory;
    private LocalDate dateOfManufacture;
    private double price;

    public Product(String manufactureCategory, LocalDate dateOfManufacture, double price) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    // Getters and setters (not shown for brevity)

    @Override
    public String toString() {
        return "Product{" +
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }

    // Other methods (not shown for brevity)
}

class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Phone", LocalDate.of(2022, 7, 15), 5000));
        productList.add(new Product("Laptop", LocalDate.of(2023, 1, 10), 3500));
        productList.add(new Product("Phone", LocalDate.of(2021, 5, 20), 2800));
        // Add more products to the list (a total of 20 products)

        List<Product> filteredProducts = productList.stream()
                .filter(product -> product.getManufactureCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());

        System.out.println("Filtered and sorted products: ");
        filteredProducts.forEach(System.out::println);
    }

    static class Employee {
        // Employee class implementation (not provided in this example)
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        // Implement this method as per your requirement
        return null;
    }
}
