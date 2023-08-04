package com.softserve.edu.homework.homework_14_Stream_API.task_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Appl {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", "2022-01-19", 450.55));
        products.add(new Product("Phone", "2023-09-20", 900.70));
        products.add(new Product("Phone", "2019-07-01", 390.70));
        products.add(new Product("Phone", "2018-05-09", 180.80));
        products.add(new Product("Phone", "2019-06-09", 220.50));
        products.add(new Product("TV", "2020-04-22", 900.60));
        products.add(new Product("TV", "2022-02-09", 1200.30));
        products.add(new Product("TV", "2023-05-16", 1500.35));
        products.add(new Product("Hoover", "2023-03-11", 290.90));
        products.add(new Product("Hoover", "2020-07-12", 210.25));
        products.add(new Product("Hoover", "2019-08-07", 180.50));
        products.add(new Product("Laptop", "2023-01-20", 1800.00));
        products.add(new Product("Laptop", "2022-04-19", 1600.00));
        products.add(new Product("Laptop", "2020-09-14", 1300.00));
        products.add(new Product("Headphone", "2019-01-20", 100.50));
        products.add(new Product("Headphone", "2022-11-01", 140.70));
        products.add(new Product("Headphone", "2023-03-13", 190.00));
        products.add(new Product("Refrigerator", "2021-05-03", 400.99));
        products.add(new Product("Refrigerator", "2023-02-09", 580.10));
        products.add(new Product("Refrigerator", "2022-03-13", 450.80));

        List<Product> filteredAndSortedProducts = products.stream()
                .filter(product -> product.getCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 300)
                .filter(Product::phones_were_made_a_year_ago)
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();
        filteredAndSortedProducts.forEach(System.out::println);

        System.out.println("The most popular name : "+Employee.mostPopularName());
    }
}
