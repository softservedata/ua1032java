package com.softserve.edu.practical.Practical_tasks_04_condition_statements.task_5;

import java.util.Scanner;
public class Product {
    private String name;
    private double price;
    private int quantity;
    Product(){
        Scanner input = new Scanner (System.in);
        System.out.print("Name : ");
        this.name = input.nextLine();
        System.out.print("Price : ");
        this.price = Double.parseDouble(input.nextLine());
        System.out.print("Quantity : ");
        this.quantity = Integer.parseInt(input.nextLine());
        System.out.println("-----------");
    }public double toPrice(){
        return price*quantity;
    }
    public double getPrice() {
        return price;
    }
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    @Override
    public String toString(){
        return " Product [ "+name+ "; Price : "+ toPrice() +"$ ; Quantity : " + quantity + " ]";
    }
}
