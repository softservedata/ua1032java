package com.softserve.projectForGraduation.CashMachine;

import java.util.List;
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



    public void loadMoney(int amount) {
        balance = getBalance() + amount;
    }

    public void withdrawMoney(int amount) {
        if(getBalance() >= amount){
            balance = getBalance() - amount;
        }else {
            System.out.println("Balance is less than amount of withdraw");
        }
    }

    public static ATM getATMByID(List<ATM> atms, int id) {
        for (ATM atm : atms) {
            if (atm.getAtmID() == id) {
                return atm;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "atmID=" + atmID +
                ", location='" + location + '\'' +
                ", balance=" + balance +
                '}';
    }
}
