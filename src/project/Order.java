package project;

import java.util.List;

public class Order {
    private int id;
    private User user;
    private List<Product> products;
    private double totalAmount;

    public Order ( int id, User user, List<Product> products, double totalAmount ) {
        this.id = id;
        this.user = user;
        this.products = products;
        this.totalAmount = totalAmount;
    }

    public int getId () {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public User getUser () {
        return user;
    }

    public void setUser ( User user ) {
        this.user = user;
    }

    public List<Product> getProducts () {
        return products;
    }

    public void setProducts ( List<Product> products ) {
        this.products = products;
    }

    public double getTotalAmount () {
        return totalAmount;
    }

    public void setTotalAmount ( double totalAmount ) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString () {
        return "Order{" +
                "id=" + id +
                ", user=" + user +
                ", products=" + products +
                ", totalAmount=" + totalAmount +
                '}';
    }
}