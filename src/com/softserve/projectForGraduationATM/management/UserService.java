package com.softserve.projectForGraduationATM.management;

import com.softserve.projectForGraduationATM.entities.ATM;
import com.softserve.projectForGraduationATM.entities.Transaction;
import com.softserve.projectForGraduationATM.entities.User;

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

    public boolean loadMoneyToCard(int amount, User user) {
        AtmService atmService = new AtmService(atm, fileHandler);
        return  atmService.loadMoneyToCard(amount, user);
    }



    public List<Transaction> viewTransactionHistory() {
        System.out.println(user.getUserID());
        return fileHandler.loadTransactionsByUserId(user.getUserID());
    }
}
