package com.softserve.edu.practical.Practical_tasks_04_condition_statements.task_4;

public class Appl {
    public static void main(String[]args){
    Product[] products = new Product[11];

    products[0] = new Product ("Milk", 1.2, 2);
    products[1] = new Product ("Yogurt", 0.9,3);
    products[2] = new Product ("Chewing gum", 0.5,1);
    products[3] = new Product ("Bread", 0.3,2);
    products[4] = new Product ("Sugar", 0.8,2);
    products[5] = new Product ("Butter", 1.2,1);
    products[6] = new Product ("Sausage", 2.1, 2);
    products[7] = new Product ("Olives", 1.3,1);
    products[8] = new Product ("Tomatoes", 0.25,8);
    products[9] = new Product ("Rice",2,1);
    products[10] = new Product ("Cream", 2.2,1);
    double totalPrice = 0.0;
    System.out.println("  ↓ This is your check ↓");
    for (Product product : products) {
        System.out.println(product);
        totalPrice += product.toPrice();
    }

    System.out.println(" To be paid : " + String.format("%.2f",totalPrice)+ "$");
    }
}
