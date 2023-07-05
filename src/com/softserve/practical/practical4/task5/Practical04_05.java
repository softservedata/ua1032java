package com.softserve.practical.practical4.task5;

public class Practical04_05 {
    // TODO: In main() method create four instances of type Product
    //      Output the name and quantity of the most expensive item;
    //      Output the name of the items, which has the biggest quantity.

    public static void findTheMostExpensiveItem(Product... products){
        Product temp = products[0];

        for(Product product: products){
            if(product.getPrice() > temp.getPrice()){
                temp = product;
            }
        }

        System.out.println("The most expensive item is:\n" + temp);
    }

    public static void findTheBiggestQuantity(Product... products){
        Product temp = products[0];
        for(Product product: products){
            if(product.getQuantity() > temp.getQuantity()){
                temp = product;
            }
        }

        System.out.println("Item, which has the biggest quantity is:\n" + temp);
    }

    public static void main(String[] args){
        Product product1 = new Product("Milk", 2.55, 8);
        Product product2 = new Product("Energy bar", 1.0, 23);
        Product product3 = new Product("Soda", 0.99, 12);
        Product product4 = new Product("Crisps", 2.30, 4);

        findTheMostExpensiveItem(product1, product2, product3, product4);
        findTheBiggestQuantity(product1,product2,product3,product4);
    }
}
