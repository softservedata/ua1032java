package com.softserve.projectForGraduationATM.management;


import com.softserve.projectForGraduationATM.entities.*;

import java.time.LocalDateTime;
import java.util.List;

public class AtmService {

    private int transactionId = 0;
    private ATM atm;
    private FileHandler fileHandler;


    public AtmService(ATM atm, FileHandler fileHandler) {
        this.atm = atm;
        this.fileHandler = fileHandler;
    }

    public void loadMoney(int amount) {
        atm.loadMoney(amount);
        fileHandler.saveATM(atm);
    }

    public boolean loadMoneyToCard(int amount, User user) {
        User newUser = new User(user.getUserID(), user.getName(),user.getPin(), (user.getBalance()+amount));
        System.out.println(newUser.getBalance());

        user.load(amount);
        atm.loadMoney(amount);

        fileHandler.saveUser(newUser);
        return true;
    }


    public double checkBalance(User user) {
        return user.getBalance();
    }

    public boolean withdrawMoney(User user, int amount, ATM atm) {
        FileHandler fileHandler = new FileHandler();
        List<Transaction> transactions = fileHandler.loadTransactions();

        if (amount > user.getBalance() || amount > atm.getBalance()) {
            return false;
        }

        int newTransactionId = transactions.stream()
                .mapToInt(Transaction::getTransactionID)
                .max()
                .orElse(0) + 1;

        LocalDateTime timestamp = LocalDateTime.now();

        user.withdraw(amount);
        atm.withdrawMoney(amount);

        Transaction transaction = new Transaction(newTransactionId, timestamp, user.getUserID(), TransactionType.WITHDRAWAL, amount);
        System.out.println(transaction);

        fileHandler.saveTransaction(transaction);
        fileHandler.saveUser(user);
        fileHandler.saveATM(atm);

        return true;
    }

}
