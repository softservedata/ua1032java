package com.softserve.practical_tasks.pr04.task4_5;

import java.util.Scanner;

public class AppProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product[] products = new Product[4];

        //input products from console
        for (int i = 0; i < products.length-1; i++) {
            System.out.println("Input information for the product " + (i+1));
            products[i]= Product.input();
        }

        //output products
        System.out.println("All products:");
        for (int i = 0; i < products.length-1; i++) {
            System.out.println(products[i]);
        }

        //find and output name and quantity of the most expensive product
        System.out.println("The most expensive product: ");
        System.out.println(Product.findMostExpensiveProduct(products).toString());

    }
}