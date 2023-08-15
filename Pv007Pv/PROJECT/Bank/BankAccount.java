package Bank;

// Abstract class that defines common attributes and methods for bank accounts
public abstract class BankAccount {
    private String accountNumber; // Account number
    private Customer owner; // Account owner
    protected double balance; // Account balance

    // Constructor for creating an account with a given account number, owner, and initial balance
    public BankAccount(String accountNumber, Customer owner, double initialBalance) {
        this.accountNumber = accountNumber; // Initialize the account number
        this.owner = owner; // Set the account owner
        this.balance = initialBalance; // Set the initial balance
    }

    // Method to get the account number
    public String getAccountNumber() {
        return accountNumber; // Return the account number
    }

    // Method to get the account owner
    public Customer getOwner() {
        return owner; // Return the account owner
    }

    // Method to get the current account balance
    public double getBalance() {
        return balance; // Return the current balance
    }

    // Protected method to set a new account balance
    protected void setBalance(double newBalance) {
        this.balance = newBalance; // Set the new balance
    }

    // Abstract method for processing a transaction on the account
    public abstract void processTransaction(double amount);

    // Abstract method for withdrawing cash from the account
    public abstract void withdrawCash(double amount);
}
