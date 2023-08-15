package Bank;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

// Main class BankingApp that contains the main method for program execution
public class BankingApp {
    public static void main(String[] args) {
        // Creating customers and accounts
        Customer customer1 = new Customer("Ivan Boy", "Shevchenko St., 12");
        SavingsAccount account1 = new SavingsAccount("0001", customer1, 1000.0);
        customer1.addAccount(account1);

        Customer customer2 = new Customer("Olya Novak", "Franko St., 4");
        CreditAccount account2 = new CreditAccount("0002", customer2, 2000);
        customer2.addAccount(account2);

        Customer customer3 = new Customer("Marta Kona", "Kozaka St., 8");
        SavingsAccount account3 = new SavingsAccount("0003", customer3, 1500.0);
        customer3.addAccount(account3);

        Customer customer4 = new Customer("Olexiy Cena", "Stryiska St., 15");
        CreditAccount account4 = new CreditAccount("0004", customer4, 3000.0);
        customer4.addAccount(account4);

        Customer customer5 = new Customer("Olena Mona", "Zelena St., 7");
        SavingsAccount account5 = new SavingsAccount("0005", customer5, 2000.0);
        customer5.addAccount(account5);

        // List of all customers
        List<Customer> allCustomers = new ArrayList<>();
        allCustomers.add(customer1);
        allCustomers.add(customer2);
        allCustomers.add(customer3);
        allCustomers.add(customer4);
        allCustomers.add(customer5);

        System.out.println("--------------------------------------------------------");
        // Displaying information about all customers and their accounts
        System.out.println("Displaying information about all customers and their accounts:");
        for (Customer customer : allCustomers) {
            System.out.println("Customer: " + customer.getName() + ", Address: " + customer.getAddress());
            for (BankAccount account : customer.getAccounts()) {
                String accountType = account instanceof SavingsAccount ? "Savings" : "Credit";
                System.out.println("Account: " + account.getAccountNumber() + ", Type: " + accountType + ", Balance: " + account.getBalance());
            }
            System.out.println("--------------------------------------------------------");
        }

        System.out.println("Displaying information before account operations: customer1 and customer2");
        System.out.println("--------------------------------------------------------");
        // Displaying information before operations
        printCustomerInfo(customer1);
        System.out.println("--------------------------------------------------------");
        printCustomerInfo(customer2);

        // Performing operations
        System.out.println("--------------------------------------------------------");
        // Operations with savings accounts
        account1.processTransaction(200.0); // Depositing to account 1
        System.out.println("--------------------------------------------------------");
        account1.processTransaction(-100.0); // Withdrawing from account 1
        System.out.println("--------------------------------------------------------");

        System.out.println("--------------------------------------------------------");
        // Operations with credit accounts
        account2.processTransaction(-100.0); // Non-cash transaction. Withdrawing from account 2
        account2.processTransaction(100.0); // Non-cash transaction. Transfer to account 2
        System.out.println("--------------------------------------------------------");
        account2.withdrawCash(200); // Depositing cash to account 2
        System.out.println("--------------------------------------------------------");
        account2.withdrawCash(-200); // Withdrawing cash from account 2
        System.out.println("--------------------------------------------------------");

        System.out.println("Displaying information after operations");

        // Displaying information after operations
        printCustomerInfo(customer1);
        System.out.println("--------------------------------------------------------");
        printCustomerInfo(customer2);
        System.out.println("--------------------------------------------------------");

        System.out.println("Customer information before sorting by descending balance");
        // Displaying information about customers before sorting
        for (Customer customer : allCustomers) {
            printCustomerInfo(customer);
        }

        // Sorting customers by balance from highest to lowest
        sortCustomersByBalanceDescending(allCustomers);

        // Displaying information about customers after sorting
        System.out.println("After sorting by descending balance:");
        for (Customer customer : allCustomers) {
            printCustomerInfo(customer);
            System.out.println("--------------------------------------------------------");
        }

        // Sorting customers by balance from lowest to highest
        sortCustomersByBalanceAscending(allCustomers);

        // Displaying information about customers after sorting
        System.out.println("After sorting by ascending balance:");
        for (Customer customer : allCustomers) {
            printCustomerInfo(customer);
            System.out.println("--------------------------------------------------------");
        }
    }

    // Method for displaying information about customers and their accounts
    public static void printCustomerInfo(Customer customer) {
        System.out.println("Customer: " + customer.getName() + ", Address: " + customer.getAddress());

        try {
            for (BankAccount account : customer.getAccounts()) {
                System.out.println("Account: " + account.getAccountNumber());

                if (account instanceof CreditAccount) {
                    System.out.println("Account Type: Credit Account");
                    System.out.println("Your Balance = " + account.getBalance());
                } else if (account instanceof SavingsAccount) {
                    System.out.println("Account Type: Savings Account");
                    System.out.println("Your Balance = " + account.getBalance());
                }
                System.out.println("--------------------");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("An error occurred while displaying customer information: " + e.getMessage());
        }
    }

    // Method for sorting customers by balance from highest to lowest
    // The sorting is based on the total balance of the customer, not individual account balances
    public static void sortCustomersByBalanceDescending(List<Customer> customers) {
        // Using the Collections.sort method to sort the list of customers
        // The Comparator parameter defines the sorting order based on defined logic
        Collections.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer customer1, Customer customer2) {
                // Getting the total balance for the first customer
                double balance1 = getTotalBalance(customer1);
                // Getting the total balance for the second customer
                double balance2 = getTotalBalance(customer2);
                // Comparing balances in reverse order (highest balance comes first)
                return Double.compare(balance2, balance1);
            }
        });
        // Displaying a message indicating the completion of sorting
        System.out.println("Sorting customers by descending balance completed");
    }

    // Method for sorting customers by balance from lowest to highest
    // The sorting is based on the total balance of the customer, not individual account balances
    public static void sortCustomersByBalanceAscending(List<Customer> customers) {
        // Using the Collections.sort method to sort the list of customers
        // The Comparator parameter defines the sorting order based on defined logic
        Collections.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer customer1, Customer customer2) {
                // Getting the total balance for the first customer
                double balance1 = getTotalBalance(customer1);
                // Getting the total balance for the second customer
                double balance2 = getTotalBalance(customer2);
                // Comparing balances in ascending order (lowest balance comes first)
                return Double.compare(balance1, balance2);
            }
        });
        // Displaying a message indicating the completion of sorting
        System.out.println("Sorting customers by ascending balance completed");
    }

    // Method for calculating the total balance of a customer by summing the balances of all their accounts
    public static double getTotalBalance(Customer customer) {
        double totalBalance = 0.0;
        try {
            for (BankAccount account : customer.getAccounts()) {
                totalBalance += account.getBalance();
            }
        } catch (Exception e) {
            System.out.println("An error occurred while calculating the total balance of the customer: " + e.getMessage());
        }
        return totalBalance;
    }
}
