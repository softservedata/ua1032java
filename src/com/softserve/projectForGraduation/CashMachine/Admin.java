package com.softserve.projectForGraduation.CashMachine;

import java.util.Objects;

public class Admin {
    private int adminID;
    private FullName name;
    private int pin;
    private String password;

    public Admin(int adminID, FullName name, int pin, String password) {
        this.adminID = adminID;
        this.name = name;
        this.pin = pin;
        this.password = password;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Admin admin)) return false;
        return getAdminID() == admin.getAdminID() && getPin() == admin.getPin() && getName().equals(admin.getName()) && getPassword().equals(admin.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAdminID(), getName(), getPin(), getPassword());
    }
}
