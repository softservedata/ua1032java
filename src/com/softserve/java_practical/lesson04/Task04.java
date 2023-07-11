package com.softserve.java_practical.lesson04;

public class Task04 {
    public static void main(String[] args) {
        Product[] products = new Product[4];
        products[0] = new Product("jeans", 99.99, 79);
        products[1] = new Product("shirt", 49.99, 99);
        products[2] = new Product("sneakers", 120.99, 34);
        products[3] = new Product("cap", 45.99, 58);

        for (Product product : products) {
            System.out.println(product.toString() + "\n");
        }

        System.out.println(Product.getMostExpensiveItem(products));
        System.out.println(Product.getItemWithBiggestQuantity(products));
    }
}