package com.softserve.edu16.notSynh;

public class Basket {
    private String fruit;

    public String pollFruit() {
        System.out.println("Get: " + fruit);
        return fruit;
    }

    public void putFruit(String fruit) {
        this.fruit = fruit;
        System.out.println("Put: " + fruit);
    }
}
