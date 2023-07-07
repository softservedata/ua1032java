package com.softserve.java_practical.lesson03;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static String getMostExpensiveItem(Product[] products) {
        Product mostExpensiveItem = products[0];
        for (Product product : products) {
            if (mostExpensiveItem.getPrice() < product.getPrice()) {
                mostExpensiveItem = product;
            }
        }
        return "The most expensive item: " + mostExpensiveItem.getName() + ". Quantity: " + mostExpensiveItem.getQuantity();
    }

    public static String getItemWithBiggestQuantity(Product[] products) {
        Product itemWithBiggestQuantity = products[0];
        for (Product product : products) {
            if (itemWithBiggestQuantity.getQuantity() < product.getQuantity()) {
                itemWithBiggestQuantity = product;
            }
        }
        return "Item with the biggest quantity: " + itemWithBiggestQuantity.getName();
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

    @Override
    public String toString() {
        return "Product { name = "
                + getName() + ", price = "
                + getPrice() + ", quantity = "
                + getQuantity() + " }";
    }
}