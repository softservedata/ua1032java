package com.softserve.hw.lesson14.task1;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Product {
    private String manufactureCategory;
    private LocalDate dateOfManufacture;
    private double price;

    public Product(String manufactureCategory, LocalDate dateOfManufacture, double price) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(product.getPrice(), getPrice()) == 0 && Objects.equals(getManufactureCategory(), product.getManufactureCategory()) && Objects.equals(getDateOfManufacture(), product.getDateOfManufacture());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getManufactureCategory(), getDateOfManufacture(), getPrice());
    }

    @Override
    public String toString() {
        return "Product: " +
                "manufactureCategory= " + manufactureCategory +
                ", dateOfManufacture= " + dateOfManufacture +
                ", price= " + price + "\n";
    }

    public static List<Product> seekProductByPriceAndYears(List<Product> products) {
        return products.stream()
                .filter(price -> price.getPrice() > 3000)
                .filter(manufactureCategory -> manufactureCategory.getManufactureCategory().equals("Smartphone"))
                .filter(year -> year.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());

    }

    public static List<Product> createList() {
        List<Product> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            result.add(new Product("Laptop",
                    LocalDate.now().minusYears(new Random().nextInt(5)),
                    new Random().nextDouble(2500.0, 4000.0)));
            for (int j = 0; j < 1; j++) {
                result.add(new Product("Smartphone",
                        LocalDate.now().minusYears(new Random().nextInt(5)),
                        new Random().nextDouble(2500.0, 4000.0)));
            }
        }
        return result;
    }
}
