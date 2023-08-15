package Bank;

import java.util.ArrayList;
import java.util.List;

// Class representing a bank customer
public class Customer {
    private String name; // Customer's name
    private String address; // Customer's address
    private List<BankAccount> accounts; // List of customer's accounts

    // Constructor for creating a customer with a given name and address
    public Customer(String name, String address) {
        this.name = name; // Initialize customer's name
        this.address = address; // Initialize customer's address
        accounts = new ArrayList<>(); // Initialize an empty list of accounts
    }

    // Method to get the customer's name
    public String getName() {
        return name; // Return customer's name
    }

    // Method to set a new customer name
    public void setName(String name) {
        this.name = name; // Set new customer name
    }

    // Method to get the customer's address
    public String getAddress() {
        return address; // Return customer's address
    }

    // Method to set a new customer address
    public void setAddress(String address) {
        this.address = address; // Set new customer address
    }

    // Method to set a list of accounts for the customer
    public void setAccounts(List<BankAccount> accounts) {
        this.accounts = accounts; // Set the list of accounts
    }

    // Method to add an account to the customer's account list
    public void addAccount(BankAccount account) {
        accounts.add(account); // Add account to the list
    }

    // Method to get the customer's list of accounts
    public List<BankAccount> getAccounts() {
        return accounts; // Return the list of accounts
    }
}
