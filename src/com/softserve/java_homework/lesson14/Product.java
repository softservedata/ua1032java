package com.softserve.java_homework.lesson14;

import java.time.LocalDate;
import java.util.*;

public class Product {
    final private String manufacturer;
    final private String manufactureCategory;
    final private LocalDate dateOfManufacture;
    final private double price;

    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Apple","Phone", LocalDate.of(2020,5,20), 3050),
                new Product("Samsung","Phone", LocalDate.of(2020,6,25), 3050),
                new Product("Samsung","TV", LocalDate.of(2023,4,15), 1900),
                new Product("Apple","Phone", LocalDate.of(2023,7,12), 4000),
                new Product("Lenovo","Laptop>", LocalDate.of(2022,1,22), 2500),
                new Product("Samsung","Phone", LocalDate.of(2021,3,14), 2050),
                new Product("Sony","Monitor", LocalDate.of(2017,2,16), 3000),
                new Product("Xiaomi","Phone", LocalDate.of(2022,8,15), 2900),
                new Product("Samsung","Phone", LocalDate.of(2019,3,7), 3100),
                new Product("Samsung","TV", LocalDate.of(2020,2,2), 3600),
                new Product("Apple","Phone", LocalDate.of(2023,6,5), 3150),
                new Product("Samsung","Monitor", LocalDate.of(2029,9,23), 2000),
                new Product("Xiaomi","Phone", LocalDate.of(2020,10,4), 2900),
                new Product("Samsung","TV", LocalDate.of(2018,11,11), 3050),
                new Product("Samsung","Phone", LocalDate.of(2017,12,30), 4000),
                new Product("LG","Monitor", LocalDate.of(2022,11,6), 2700),
                new Product("Apple","Phone", LocalDate.of(2021,4,3), 3200),
                new Product("Samsung","TV", LocalDate.of(2020,2,14), 1900),
                new Product("Samsung","Phone", LocalDate.of(2022,9,12), 1800),
                new Product("Asus","Laptop", LocalDate.of(2020,1,25), 3050));

        List<Product> phones = products.stream()
                .filter(product -> product.getManufactureCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();

        phones.forEach(System.out::println);
    }

    public Product(String manufacturer, String manufactureCategory, LocalDate dateOfManufacture, double price) {
        this.manufacturer = manufacturer;
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName()
                + " { manufacture = " + getManufacturer()
                + ", manufacture category = " + getManufactureCategory()
                + ", date of manufacture = " + getDateOfManufacture()
                + ", price = " + getPrice()
                + " }";
    }
}

