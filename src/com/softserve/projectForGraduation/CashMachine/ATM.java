package com.softserve.projectForGraduation.CashMachine;

import java.util.Objects;

public class ATM {
    private int atmID;
    private String location;
    private int balance;

    public ATM(int atmID, String location, int balance) {
        this.atmID = atmID;
        this.location = location;
        this.balance = balance;
    }

    public int getAtmID() {
        return atmID;
    }

    public void setAtmID(int atmID) {
        this.atmID = atmID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ATM atm)) return false;
        return getAtmID() == atm.getAtmID() && getBalance() == atm.getBalance() && getLocation().equals(atm.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAtmID(), getLocation(), getBalance());
    }
}
