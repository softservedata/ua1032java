package com.softserve.homework.hw14.task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppProduct {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        //create 10 phones products
        // 5 phones must match by date and 3 by price
        for (int i = 0; i < 10; i++) {
            Product product = new Product("Phone", LocalDate.now().minusMonths((i + 6)), (((i + 1) * 400)));
            products.add(product);
        }

        //create 10 laptops
        for (int i = 0; i < 10; i++) {
            Product product = new Product("Laptop", LocalDate.now().minusMonths((i + 4)), (((i * 100) +2600)));
            products.add(product);
        }

        //print list of all prod.
        System.out.println("All products: \n");
        products.stream().toList().forEach(product -> System.out.println(product.toString()));

        //parameters to filter list of prod.
        String category = "Phone";
        double price = 3000;
        int yearsBefore = 1;

        //print filtered list of prod.
        System.out.println("Filtered products:");
        List<Product> filteredProducts =Product.showListOfProducts(products, category, price, yearsBefore);
        filteredProducts.stream().toList().forEach(product -> System.out.println(product.toString()));

    }
}
