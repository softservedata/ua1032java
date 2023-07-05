package com.softserve.lesson04.pt04.task04;

public class Product {
    private String name;
    private double price;
    int quantity;

    public Product() {
    }

    public Product(String name, double price, int quantity) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (Double.compare(product.price, price) != 0) return false;
        if (quantity != product.quantity) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + quantity;
        return result;
    }

    @Override
    public String toString() {
        return "Product {" +
                "name= '" + name + '\'' +
                ", price= " + price +
                ", quantity= " + quantity +
                '}';
    }

    public Product compareProductsPrice (Product productOne, Product productTwo, Product productThree) {

        if (this.price >= productOne.price && this.price >= productTwo.price && this.price >= productThree.price) {
            return this;
        }

        if (productOne.price >= productTwo.price && productOne.price >= productThree.price) {
            return productOne;
        }

        if (productTwo.price >= productThree.price) {
            return productTwo;
        }

        return productThree;

    }

    public Product compareProductsQuantity (Product productOne, Product productTwo, Product productThree) {

        if (this.quantity >= productOne.quantity && this.quantity >= productTwo.quantity && this.quantity >= productThree.quantity) {
            return this;
        }

        if (productOne.quantity >= productTwo.quantity && productOne.quantity >= productThree.quantity) {
            return productOne;
        }

        if (productTwo.quantity >= productThree.quantity) {
            return productTwo;
        }

        return productThree;

    }

}
