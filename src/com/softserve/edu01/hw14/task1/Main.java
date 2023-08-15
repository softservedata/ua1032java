package com.softserve.edu01.hw14.task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Phone", 1000, LocalDate.of(2014, 7, 8)));
        productList.add(new Product("Phone", 2000, LocalDate.of(2023, 6, 9)));
        productList.add(new Product("Phone", 1500, LocalDate.of(2023, 5, 3)));
        productList.add(new Product("Phone", 5433, LocalDate.of(2021, 7, 23)));
        productList.add(new Product("Phone", 4321, LocalDate.of(2022, 2, 25)));
        productList.add(new Product("Phone", 4223, LocalDate.of(2023, 3, 12)));
        productList.add(new Product("Phone", 432, LocalDate.of(2014, 3, 19)));
        productList.add(new Product("Phone", 1430, LocalDate.of(2023, 4, 29)));
        productList.add(new Product("Phone", 1760, LocalDate.of(2021, 10, 20)));
        productList.add(new Product("Phone", 600, LocalDate.of(2014, 10, 11)));
        productList.add(new Product("Phone", 1565, LocalDate.of(2022, 9, 27)));
        productList.add(new Product("Phone", 490, LocalDate.of(2014, 8, 4)));
        productList.add(new Product("Phone", 550, LocalDate.of(2015, 6, 3)));
        productList.add(new Product("Phone", 800, LocalDate.of(2016, 11, 24)));
        productList.add(new Product("Phone", 900, LocalDate.of(2017, 12, 13)));
        productList.add(new Product("Phone", 565, LocalDate.of(2020, 5, 1)));
        productList.add(new Product("Phone", 5730, LocalDate.of(2018, 5, 2)));
        productList.add(new Product("Phone", 6460, LocalDate.of(2018, 3, 18)));
        productList.add(new Product("Phone", 745, LocalDate.of(2019, 6, 15)));

        List<Product> filteredProducts = productList.stream()
                .filter(product -> product.price() > 3000)
                .filter(product -> product.dateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product::price))
                .toList();

        System.out.println("Filtered product: \n" + filteredProducts);
    }
}
