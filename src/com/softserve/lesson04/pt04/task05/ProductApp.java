package com.softserve.lesson04.pt04.task05;

import com.softserve.lesson04.pt04.task04.Product;

public class ProductApp {
    public static void main(String[] args) {
        Product productOne = new Product("Lenovo", 1200, 300);
        Product productTwo = new Product("Asus", 1500, 200);
        Product productThree = new Product("HP", 900, 250);
        Product productFour = new Product("MSI", 1000, 400);

        Product maxPriceProduct = new Product();
        Product maxQuantityProduct= new Product();

        maxPriceProduct = productOne.compareProductsPrice(productTwo, productThree, productFour);
        System.out.println("The name of the most expensive product: " + maxPriceProduct.getName());
        System.out.println("The quantity of the most expensive product: " + maxPriceProduct.getQuantity());

        maxQuantityProduct = productOne.compareProductsQuantity(productTwo, productThree, productFour);
        System.out.println("The name of product with biggest quantity: " + maxQuantityProduct.getName());
    }
}
