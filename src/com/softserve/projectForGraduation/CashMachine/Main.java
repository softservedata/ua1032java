package com.softserve.projectForGraduation.CashMachine;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //menu
        FileHandler fileHandler = new FileHandler();
        AuthorizationService authService = new AuthorizationService();
        Random random = new Random();
        Admin admin;
        ATM atm;
        User user;

        Scanner sc = new Scanner(System.in);


//        // Create admins
//        for (int i = 1; i <=10; i++) {
//             admin = new Admin(i, new FullName(i+"First", i+"Last"), (i*1111), "pas"+i);
//            fileHandler.saveAdmin(admin);
//        }
//
//
//        // Create ATMs
//        for (int i = 1; i <=10 ; i++) {
//            atm = new ATM(i, "Street"+i, (i*1000));
//            fileHandler.saveATM(atm);
//        }
//
//
//        // Create users
//        for (int i = 1; i <=10 ; i++) {
//            user = new User(i, new FullName(i+"First", i+"Last"), (i*1111), (i*1000));
//            fileHandler.saveUser(user);
//        }


        //load lists from files
        List<Admin> listOfAdmins = fileHandler.loadAdmins();
        List<User> listOfUsers = fileHandler.loadUsers();
        List<ATM> listOfATMs = fileHandler.loadATMs();

        // Generate a random number between 1 and 10
        int randomNumb = random.nextInt(10) + 1;
        ATM atmRand = ATM.getATMByID(listOfATMs, randomNumb);
        if (atmRand == null) {
            System.out.println("Error! try again");
        } else {
            AtmService atmService = new AtmService(atmRand, fileHandler);
            System.out.println("Welcome to ATM: " + atmRand.getAtmID() + " " + atmRand.getLocation());
            System.out.println("""
                    Whom would you like to authorize:\s
                    1) user\s
                    2) admin\s""");

            int person;
            do {
                System.out.print("Press 1 or 2: ");
                person = sc.nextInt();
            } while (person != 1 && person != 2);
            switch (person) {
                case 1: {
                    System.out.println("User");
                    // User authorization
                    User userAuthorized = AuthorizationService.userAuthorization(listOfUsers);

                    UserService userService = new UserService(userAuthorized, atmRand, fileHandler);

                    System.out.println("User Balance: " + userService.checkUserBalance());

                    boolean withdrawSuccess = userService.withdrawMoney(1000);
                    System.out.println("Withdrawal Success: " + withdrawSuccess);

                    System.out.println("User Balance: " + userService.checkUserBalance());

//                    List<Transaction> userTransactions = userService.viewTransactionHistory();
//                    System.out.println("User Transactions:");
//                    for (Transaction transaction : userTransactions) {
//                        System.out.println(transaction);
//                    }

                    break;
                }
                case 2: {
                    System.out.println("Admin");
                    break;
                }
            }
        }


//
//        // Admin authorization and ATM loading money
//        authService.adminAuthorization(listOfAdmins);
//        atmService.loadMoney(5000);
//

//
    }
}
