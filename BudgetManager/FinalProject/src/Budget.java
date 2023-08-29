import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Budget implements Serializable {
    private List<Transaction> transactions = new ArrayList<>();
    private static double balance;

    private static final long serialVersionUID = 1L;

    public Budget() {
        this.transactions = new ArrayList<>();
        this.balance = 0.0;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        updateBalance();
    }

    public void removeTransaction(int transactionId) {
        Transaction transactionToRemove = getTransactionById(transactionId);
        if (transactionToRemove != null) {
            transactions.remove(transactionToRemove);
            updateBalance();
        }
    }

    public Transaction getTransactionById(long transactionId) {
        for (Transaction transaction : transactions) {
            if (transaction.getId() == transactionId) {
                return transaction;
            }
        }
        return null;
    }

    public void editTransaction(int transactionId, String type, double amount, String category) {
        Transaction transactionToEdit = getTransactionById(transactionId);
        if (transactionToEdit != null) {
            transactionToEdit.setType(type);
            transactionToEdit.setMoneyAmount(amount);
            transactionToEdit.setCategory(category);
            updateBalance();
        }
    }


     public void updateBalance() {
          for (Transaction transaction : transactions) {
            if (transaction.getType().equalsIgnoreCase("прибуток")) {
                balance += transaction.getMoneyAmount();
            } else if (transaction.getType().equalsIgnoreCase("витрата")) {
                balance -= transaction.getMoneyAmount();
            }
        }
         System.out.println("Загальний баланс: " + balance);
    }


    public List<Transaction> getTransactions() {
        return transactions;
    }

    public static double getBalance() {
        return balance;
    }


}
