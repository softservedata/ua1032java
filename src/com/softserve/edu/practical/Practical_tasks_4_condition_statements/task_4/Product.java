package com.softserve.edu.practical.Practical_tasks_4_condition_statements.task_4;

public class Product {
    private String name;
    private double price;
    private  int quantity;

    Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public double toPrice(){
        return price*quantity;
    }
    @Override
    public String toString(){
        return " Product [ "+name+ "; Price : "+ toPrice() +"$ ; Quantity : " + quantity + " ]";
    }
}
