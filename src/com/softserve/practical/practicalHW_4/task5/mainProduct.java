package com.softserve.practical.practicalHW_4.task5;

import com.softserve.practical.practicalHW_4.task4.Product;

public class mainProduct {
    public static void main(String[] args) {
        Product pr1 = new Product("Product1", 265.5, 90);
        Product pr2 = new Product("Product2", 0.5, 900);
        Product pr3 = new Product("Product3", 1200, 10);
        Product pr4 = new Product("Product4", 99.9, 91);
        double maxPrice = Math.max(Math.max(pr1.getPrice(), pr2.getPrice()), Math.max(pr3.getPrice(), pr4.getPrice()));
        if (maxPrice == pr1.getPrice()) {
            System.out.println(pr1.getName() + " " + pr1.getQuantity());
        } else if (maxPrice == pr2.getPrice()) {
            System.out.println(pr2.getName() + " " + pr2.getQuantity());
        } else if (maxPrice == pr3.getPrice()) {
            System.out.println(pr3.getName() + " " + pr3.getQuantity());
        } else if (maxPrice == pr4.getPrice()) {
            System.out.println(pr4.getName() + " " + pr4.getQuantity());
        }
        System.out.println("-".repeat(60));
        double maxCount = Math.max(Math.max(pr1.getQuantity(), pr2.getQuantity()), Math.max(pr3.getQuantity(), pr4.getQuantity()));
        if (maxCount == pr1.getQuantity()) {
            System.out.println(pr1.getName());
        } else if (maxCount == pr2.getQuantity()) {
            System.out.println(pr2.getName());
        } else if (maxCount == pr3.getQuantity()) {
            System.out.println(pr3.getName());
        } else if (maxCount == pr4.getQuantity()) {
            System.out.println(pr4.getName());
        }
    }
}
