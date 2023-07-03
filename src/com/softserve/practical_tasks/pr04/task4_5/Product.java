package com.softserve.practical_tasks.pr04.task4_5;

import java.util.Scanner;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public static Product input() {
        Scanner sc = new Scanner(System.in);

        String name;
        while (true) {
            System.out.print("  name: ");
            name = sc.nextLine();
            try {
                if (name != null && name.matches("[a-zA-Z]+")) {
                    break;
                } else {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid name. Please input a valid name consisting of alphabetic characters.");
            }
        }


            double price;
        while (true) {
            System.out.print("  price: ");
            price = sc.nextDouble();
            try {
                if (price > 0) {
                    break;
                } else throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                System.out.print("Price must be > 0. Input price again. ");
            }
        }

        int quantity;
        while (true) {
            System.out.print("  quantity: ");
            quantity = sc.nextInt();
            try {
                if (quantity > 0) {
                    break;
                } else throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                System.out.print("Quantity must be > 0. Input quantity again. ");
            }
        }
        return new Product(name, price, quantity);
    }

    public static Product findMostExpensiveProduct(Product[] products){
        Product mostExpensiveProduct = null;
        if(products.length>0) {
                mostExpensiveProduct = products[0];
            for (int i = 0; i < products.length - 1; i++) {
                for (int j = i; j < products.length - 1; j++) {
                    if(mostExpensiveProduct.price < products[j].price){
                        mostExpensiveProduct = products[j];
                    }
                }
            }
        }
        return mostExpensiveProduct;
    }

    @Override
    public String toString() {
        return "-------- Product --------\n " +
                "name:" + name + "\n" +
                "price= " + price + "\n"+
                "quantity= " + quantity + "\n";
    }
}
