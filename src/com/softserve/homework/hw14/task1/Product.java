package com.softserve.homework.hw14.task1;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Product {

    private String manufactureCategory;
    private LocalDate manufactureDate;
    private double price;

    public Product(String manufactureCategory, LocalDate manufactureDate, double price) {
        this.manufactureCategory = manufactureCategory;
        this.manufactureDate = manufactureDate;
        this.price = price;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public double getPrice() {
        return price;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(product.getPrice(), getPrice()) == 0 && getManufactureCategory().equals(product.getManufactureCategory()) && getManufactureDate().equals(product.getManufactureDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getManufactureCategory(), getManufactureDate(), getPrice());
    }

    @Override
    public String toString() {
        return "\n"+
                "\nCategory= " + manufactureCategory +
                "\nDate=" + manufactureDate +
                "\nPrice=" + price;
    }

    public static List<Product> showListOfProducts(List<Product> products, String manufactureCategory, double price, int yearsBefore){
        LocalDate dateYearsBefore = LocalDate.now().minusYears(yearsBefore);

        return products.stream()
                        .filter((product -> manufactureCategory.equals(product.getManufactureCategory())))
                        .filter((product -> product.getPrice() > price))
                        .filter(product -> product.getManufactureDate().isBefore(dateYearsBefore))
                        .sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                        .collect(Collectors.toList());
    }
}
