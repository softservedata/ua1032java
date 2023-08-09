package com.softserve.projectForGraduation.CashMachine;

import java.time.LocalDateTime;

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

    public double checkBalance(User user) {
        return user.getBalance();
    }

    public boolean withdrawMoney(User user, int amount, ATM atm) {
        if (amount > user.getBalance() || amount > atm.getBalance()) {
            return false;
        }

        int newTransactionId = ++transactionId;
        LocalDateTime timestamp = LocalDateTime.now();

        user.withdraw(amount);
        atm.withdrawMoney(amount);

        Transaction transaction = new Transaction(newTransactionId, timestamp, user.getUserID(), TransactionType.WITHDRAWAL, amount);
        System.out.println(transaction);
        System.out.println(user);
        System.out.println(atm);

        fileHandler.saveTransaction(transaction);
        fileHandler.saveUser(user);
        fileHandler.saveATM(atm);

        return true;
    }
}
