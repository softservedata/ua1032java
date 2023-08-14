package project;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private int id;
    private String username;
    private String password;
    private String phoneNumber;
    private List<Product> cartItems = new ArrayList<> ( );
    private List<Order> orderHistory = new ArrayList<> ( );

    public User ( int id, String username, String password, String phoneNumber ) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.cartItems = cartItems;
        this.orderHistory = orderHistory;
    }

    public int getId () {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public String getUsername () {
        return username;
    }

    public void setUsername ( String username ) {
        this.username = username;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword ( String password ) {
        this.password = password;
    }

    public String getPhoneNumber () {
        return phoneNumber;
    }

    public void setPhoneNumber ( String phoneNumber ) {
        this.phoneNumber = phoneNumber;
    }

    public void setCartItems ( List<Product> cartItems ) {
        this.cartItems = cartItems;
    }

    public void setOrderHistory ( List<Order> orderHistory ) {
        this.orderHistory = orderHistory;
    }


    @Override
    public String toString () {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", cartItems=" + cartItems +
                ", orderHistory=" + orderHistory +
                '}';
    }

    public void addToCart ( Product product ) {
        cartItems.add ( product );
    }

    public List<Product> getCartItems () {
        return cartItems;
    }

    public void clearCart () {
        cartItems.clear ( );
    }

    public void addToOrderHistory ( Order order ) {
        orderHistory.add ( order );
    }

    public List<Order> getOrderHistory () {
        return orderHistory;
    }



}