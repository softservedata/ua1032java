package com.softserve.edu14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

record Product(String name, String category, double price) {

    public static List<Product> filterProducts(List<Product> products, Predicate<Product> predicate) {
        // Method to filter products based on the given Predicate
        List<Product> filteredProducts = new ArrayList<>();

        for (Product product : products) {
            if (predicate.test(product)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
}

public class ProductFilter {


    public static void main(String[] args) {
        // Example input data (list of products)
        List<Product> products = new ArrayList<>();
        products.add(new Product("Smartphone", "electronics", 10000));
        products.add(new Product("TV", "electronics", 15000));
        products.add(new Product("T-shirt", "clothing", 250));

        // Example filtering: selecting only electronics products with price not exceeding 1200
        Predicate<Product> electronicsAndAffordable = product ->
            product.category().equals("electronics") && product.price() <= 10000;

        List<Product> filteredProducts = Product.filterProducts(products, electronicsAndAffordable);


        // Displaying the results
        System.out.println("Filtered products:");
        for (Product product : filteredProducts) {
            System.out.println(product.name() + " - " + product.price());
        }

    }
}
