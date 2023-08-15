package Bank;

// Class representing a credit account in the bank
public class CreditAccount extends BankAccount {
    private double initialBalance; // Initial account balance
    private AccountType accountType; // Field to store the account type

    // Constructor for creating a credit account object
    public CreditAccount(String accountNumber, Customer accountHolder, double initialBalance) {
        super(accountNumber, accountHolder, initialBalance); // Call to the base class constructor
        this.initialBalance = initialBalance; // Initialize initial balance
        this.accountType = AccountType.CREDIT; // Set account type to "Credit"
    }

    // Method to get the initial account balance
    public double getInitialBalance() {
        return initialBalance;
    }

    // Method to change the initial account balance
    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    // Method to get the account type
    public AccountType getAccountType() {
        return accountType;
    }

    // Overridden method to get the balance considering the sign
    @Override
    public double getBalance() {
        double balance = super.getBalance();
        if (balance < 0) {
            return -balance; // Return opposite sign for comparison with debit accounts
        } else {
            return balance; // Return positive balance as it is
        }
    }

    // Overridden method to process a transaction
    @Override
    public void processTransaction(double amount) {
        if (amount >= 0 || (amount < 0 && (getBalance() + amount) >= -initialBalance)) {
            super.setBalance(getBalance() + amount);
            if (amount < 0) {
                initialBalance += amount;
            }
            System.out.println("Operation successfully processed. Your balance = " + getBalance());
        } else {
            System.out.println("Insufficient funds and credit limit reached.");
        }
    }

    // Overridden method to withdraw cash from the account
    @Override
    public void withdrawCash(double amount) {
        try {
            if (amount < 0) { // Withdrawal of funds
                double newBalance = getBalance() + amount; // Decrease balance

                if (newBalance >= -initialBalance) {
                    super.setBalance(newBalance);
                    this.initialBalance -= Math.abs(amount); // Decrease credit limit
                    System.out.println("Cash withdrawal of " + Math.abs(amount) + " successfully processed.");
                    System.out.println("Credit limit of your balance = " + getBalance());
                } else {
                    System.out.println("Insufficient funds and credit limit reached.");
                }
            } else { // Deposit of funds
                double newBalance = getBalance() + amount; // Increase balance
                double newCreditLimit = initialBalance + amount; // Increase credit limit

                super.setBalance(newBalance);
                this.initialBalance = newCreditLimit;
                System.out.println("Cash deposit of " + amount + " successfully processed.");
                System.out.println("Credit limit of your balance = " + getBalance());
            }
        } catch (Exception e) {
            System.out.println("An error occurred while processing the operation: " + e.getMessage());
        }
    }
}
