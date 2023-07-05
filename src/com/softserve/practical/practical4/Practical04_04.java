package com.softserve.practical.practical4;

public class Practical04_04 {
    // TODO: Create class called Product that has the following fields:
    //      String name, double price and int quantity.

    private String name;
    private double price;
    private int quantity;

    public Practical04_04() {
        name = "none";
        price = 0.0;
        quantity = 0;
    }
    public Practical04_04(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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
