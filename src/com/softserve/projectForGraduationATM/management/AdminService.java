package com.softserve.projectForGraduationATM.management;

import com.softserve.projectForGraduationATM.entities.*;

import java.util.List;
public class AdminService {
    private Admin admin;
    private ATM atm;
    private FileHandler fileHandler;

    public AdminService(Admin admin, ATM atm, FileHandler fileHandler) {
        this.admin = admin;
        this.atm = atm;
        this.fileHandler = fileHandler;
    }

    public double checkATMBalance() {
        return atm.getBalance();
    }

    public boolean loadMoneyToATM(int amount, ATM atm) {
        AtmService atmService = new AtmService(atm, fileHandler);
        return  atmService.loadMoney(amount);
    }

//    public List<Transaction> viewATMTransactionHistory() {
//        System.out.println(atm.getATMByID());
//        return fileHandler.loadTransactionsByAtmID(atm.getAtmID());
//    }
}
