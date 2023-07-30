package practicals.p4.task5;
/*
In main() method create four instances of type Product
Output the name and quantity of the most expensive item;
Output the name of the items, which has the biggest quantity.
 */

import practicals.p4.task4.Product;

public class Main {

    public static void main(String[] args) {

    Product product1 = new Product( "bread", 20, 2 );
    Product product2 = new Product( "milk", 50, 1 );
    Product product3 = new Product( "butter", 50, 3 );

    // Find the most expensive item
    Product mostExpensiveItem = product1;

        if (product2.getPrice() > mostExpensiveItem.getPrice()) {
        mostExpensiveItem = product2;
    }
        if (product3.getPrice() > mostExpensiveItem.getPrice()) {
        mostExpensiveItem = product3;
    }

    // Output the name and quantity of the most expensive item
        System.out.println("Most Expensive:");
        System.out.println("Name: " + mostExpensiveItem.getName());
        System.out.println("Quantity: " + mostExpensiveItem.getQuantity());

    // Find the item with the biggest quantity
    Product itemWithBiggestQuantity = product1;

        if (product2.getQuantity() > itemWithBiggestQuantity.getQuantity()) {
        itemWithBiggestQuantity = product2;
    }
        if (product3.getQuantity() > itemWithBiggestQuantity.getQuantity()) {
        itemWithBiggestQuantity = product3;
    }
    // Output the name of the item with the biggest quantity
        System.out.println("\nBiggest Quantity:");
        System.out.println("Name: " + itemWithBiggestQuantity.getName());
        System.out.println("Quantity: " + itemWithBiggestQuantity.getQuantity());
    }
}