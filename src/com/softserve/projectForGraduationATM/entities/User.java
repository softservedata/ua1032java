package com.softserve.projectForGraduationATM.entities;

import java.util.Objects;

public class User {
    private int userID;
    private FullName name;
    private int pin;
    private double balance;

    public User(int userID, FullName name, int pin, double balance) {
        this.userID = userID;
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return getUserID() == user.getUserID() && getPin() == user.getPin() && getName().equals(user.getName()) && getBalance() == (user.getBalance());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserID(), getName(), getPin(), getBalance());
    }

    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            balance = getBalance() - amount;
        } else {
            System.out.println("Balance is less than amount of withdraw");
        }
    }

    public void load(int amount){
        balance = getBalance() + amount;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", name=" + name +
                ", pin=" + pin +
                ", balance=" + balance +
                '}';
    }
}

