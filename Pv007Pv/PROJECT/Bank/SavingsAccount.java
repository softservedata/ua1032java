package Bank;

// The SavingsAccount class inherits properties and methods from the BankAccount class,
// represents a savings account (debit account) with no cash withdrawal capability.
public class SavingsAccount extends BankAccount {
    private AccountType accountType; // Field to store the account type

    // Constructor of the class that initializes properties of SavingsAccount class and the base class BankAccount.
    public SavingsAccount(String accountNumber, Customer owner, double initialBalance) {
        super(accountNumber, owner, initialBalance); // Call the constructor of the base class
        this.accountType = AccountType.SAVINGS; // Set the account type
    }

    // Method to get the account type.
    public AccountType getAccountType() {
        return accountType;
    }

    // Overridden method to process transactions on the account.
    @Override
    public void processTransaction(double amount) {
        try {
            if (amount > 0) {
                balance += amount; // Deposit the amount into the account
                System.out.println("Amount " + amount + " deposited. Transaction successful.");
                System.out.println("Your balance = " + balance);
            } else if (amount < 0) {
                if (balance >= Math.abs(amount)) {
                    balance += amount; // Withdraw funds from the account
                    System.out.println("Amount " + Math.abs(amount) + " withdrawn. Transaction successful.");
                    System.out.println("Your balance = " + balance);
                } else {
                    System.out.println("Insufficient funds to perform the operation.");
                }
            } else {
                System.out.println("Invalid amount for transaction.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while processing the transaction: " + e.getMessage());
        }
    }

    // Overridden method to prohibit cash withdrawal from savings account.
    @Override
    public void withdrawCash(double amount){
        System.out.println("Cash withdrawal from 'SavingsAccount' type account is not allowed.");
    }
}
