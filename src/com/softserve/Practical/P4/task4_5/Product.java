package com.softserve.Practical.P4.task4_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Product {
//    private static Product expensiveProd;
//    private static Product biggestProduct;
//    private void audit(){
//        if(expensiveProd.price < this.price){
//            expensiveProd = new Product(name,price,quantity);
//        }
//        if(biggestProduct.quantity <this.quantity){
//            biggestProduct = new Product(name,price,quantity);
//        }
//    }
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(){
        name = "Noname";
        price = 0;
        quantity = 0;

    }

    public void input()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Name: ");
        name = br.readLine();
        System.out.print("Price: ");
        price = Double.parseDouble(br.readLine());
        System.out.print("Quantity: ");
        quantity = Integer.parseInt(br.readLine());


    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
