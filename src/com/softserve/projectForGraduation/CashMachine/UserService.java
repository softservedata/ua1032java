package com.softserve.projectForGraduation.CashMachine;

import com.softserve.edu10box.A;

import java.security.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

public class UserService {
    private User user;
    private ATM atm;
    private FileHandler fileHandler;

    public UserService(User user, ATM atm, FileHandler fileHandler) {
        this.user = user;
        this.atm = atm;
        this.fileHandler = fileHandler;
    }

    public double checkUserBalance() {
        return user.getBalance();
    }

    public boolean withdrawMoney(int amount) {
        AtmService atmService = new AtmService(atm, fileHandler);
        return  atmService.withdrawMoney(user, amount, atm);
    }

    public List<Transaction> viewTransactionHistory() {
        return fileHandler.loadTransactionsByUserId(user.getUserID());
    }
}
