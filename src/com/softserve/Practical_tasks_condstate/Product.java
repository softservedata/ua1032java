package com.softserve.Practical_tasks_condstate;

//task 4 and 5 conditional statements
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

    public static void main(String[] args) {
        // Create four instances of Product
        Product product1 = new Product("Item1", 10.99, 5);
        Product product2 = new Product("Item2", 15.99, 8);
        Product product3 = new Product("Item3", 12.99, 3);
        Product product4 = new Product("Item4", 19.99, 10);

        // Output the name and quantity of the most expensive item
        Product mostExpensiveItem = findMostExpensiveItem(product1, product2, product3, product4);
        System.out.println("Most Expensive Item: " + mostExpensiveItem.getName() + ", Quantity: " + mostExpensiveItem.getQuantity());

        // Output the name of the item(s) with the biggest quantity
        Product[] itemsWithBiggestQuantity = findItemsWithBiggestQuantity(product1, product2, product3, product4);
        System.out.print("Item(s) with Biggest Quantity: ");
        for (Product item : itemsWithBiggestQuantity) {
            System.out.print(item.getName() + " ");
        }
    }

    public static Product findMostExpensiveItem(Product... products) {
        Product mostExpensiveItem = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() > mostExpensiveItem.getPrice()) {
                mostExpensiveItem = products[i];
            }
        }
        return mostExpensiveItem;
    }

    public static Product[] findItemsWithBiggestQuantity(Product... products) {
        int maxQuantity = products[0].getQuantity();
        int count = 0;

        // Find the maximum quantity
        for (Product product : products) {
            if (product.getQuantity() > maxQuantity) {
                maxQuantity = product.getQuantity();
            }
        }

        // Count the number of items with the maximum quantity
        for (Product product : products) {
            if (product.getQuantity() == maxQuantity) {
                count++;
            }
        }

        // Create an array to store the items with the maximum quantity
        Product[] itemsWithBiggestQuantity = new Product[count];
        int index = 0;

        // Populate the array with the items with the maximum quantity
        for (Product product : products) {
            if (product.getQuantity() == maxQuantity) {
                itemsWithBiggestQuantity[index] = product;
                index++;
            }
        }

        return itemsWithBiggestQuantity;
    }
}