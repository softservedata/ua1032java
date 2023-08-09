package com.softserve.projectForGraduation.CashMachine;

public class probaApp {

    public static void main(String[] args) {

        // Create admin
        Admin admin = new Admin(1, new FullName("AFirst", "ALast"), 1234, "adminPass");
     //   fileHandler.saveAdmin(admin);

        // Create ATM
        ATM atm = new ATM(1, "Street1", 10000);
     //   fileHandler.saveATM(atm);

        // Create user
        User user = new User(1, new FullName("UFirst", "ULast"), 4321, 5000.0);
     //   fileHandler.saveUser(user);

        System.out.println(admin.toString());
        System.out.println(user.toString());
        System.out.println(atm.toString());

    }
}

