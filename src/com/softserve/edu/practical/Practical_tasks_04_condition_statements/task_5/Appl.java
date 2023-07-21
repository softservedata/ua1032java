package com.softserve.edu.practical.Practical_tasks_04_condition_statements.task_5;
public class Appl {
    public static void main(String[] args) {
        Product[] products = new Product[4];
        products[0] = new Product();
        products[1] = new Product();
        products[2] = new Product();
        products[3] = new Product();
        int q = 0;
        double maxprice = 0;
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
            if (products[i].getPrice() > maxprice) {
                maxprice = products[i].getPrice();
                q = i;
            }
        }
        System.out.println("\nThe name of the most expensive product : " + products[q].getName() + "[" + products[q].getQuantity() + "]");
        int quantity_ = 0;
        int l = 0;
        for (int j = 0; j < products.length; j++) {
            if (products[j].getQuantity() > quantity_) {
                quantity_ = products[j].getQuantity();
                l = j;
            }
        }
        System.out.println("\nThe product of which is the largest in quantity is : " + products[l].getName());
    }
}