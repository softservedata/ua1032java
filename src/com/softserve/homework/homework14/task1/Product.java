package com.softserve.homework.homework14.task1;

import java.time.LocalDate;

public class Product implements Comparable<Product> {
    private String category;
    private LocalDate dayOfManufacture;
    private double price;

    public Product(String category, int day, int month, int year, double price) {
        this.category = category;
        this.dayOfManufacture = LocalDate.of(year, month, day);
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getDayOfManufacture() {
        return dayOfManufacture;
    }

    @Override
    public String toString() {
        return "Product { " +
                "category = '" + category + '\'' +
                ", dayOfManufacture = " + dayOfManufacture +
                ", price = " + price +
                " }";
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
