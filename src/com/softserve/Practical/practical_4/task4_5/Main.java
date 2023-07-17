package com.softserve.Practical.practical_4.task4_5;
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Beer", 1.5, 10);
        Product product2 = new Product("Banana", 0.3, 20);
        Product product3 = new Product("Onion", 0.4, 15);
        Product product4 = new Product("Apple", 1.0, 5);

        Product mostExpensive = product1;
        if (product2.price > mostExpensive.price) mostExpensive = product2;
        if (product3.price > mostExpensive.price) mostExpensive = product3;
        if (product4.price > mostExpensive.price) mostExpensive = product4;
        System.out.println("The most expensive item is: " + mostExpensive.name + " with a quantity of " + mostExpensive.quantity);

        Product biggestQuantity = product1;
        if (product2.quantity > biggestQuantity.quantity) biggestQuantity = product2;
        if (product3.quantity > biggestQuantity.quantity) biggestQuantity = product3;
        if (product4.quantity > biggestQuantity.quantity) biggestQuantity = product4;
        System.out.println("The item with the biggest quantity is: " + biggestQuantity.name);
    }
}

