package com.softserve.projectForGraduationATM;

import com.softserve.projectForGraduationATM.entities.*;
import com.softserve.projectForGraduationATM.management.*;

import java.util.List;
import java.util.Scanner;

public class ApplicationATM {
    public static void main(String[] args) {
        //menu
        FileHandler fileHandler = new FileHandler();
        AuthorizationService authService = new AuthorizationService();
        Admin admin;
        ATM atm;
        User user;

        Scanner sc = new Scanner(System.in);

//
//        // Create admins
//        for (int i = 1; i <= 10; i++) {
//            admin = new Admin(i, new FullName(i + "First", i + "Last"), (i * 1111), "pas" + i);
//            fileHandler.saveAdmin(admin);
//        }
//
//
//        // Create ATMs
//        for (int i = 1; i <= 10; i++) {
//            atm = new ATM(i, "Street" + i, (i * 15000));
//            fileHandler.saveATM(atm);
//        }
//
//
//        // Create users
//        for (int i = 1; i <= 10; i++) {
//            user = new User(i, new FullName(i + "First", i + "Last"), (i * 1111), (i * 1000));
//            fileHandler.saveUser(user);
//        }


        //load lists from files
        List<Admin> listOfAdmins = fileHandler.loadAdmins();
        List<ATM> listOfATMs = fileHandler.loadATMs();
        List<User> listOfUsers = fileHandler.loadUsers();


        System.out.println(listOfUsers);
        System.out.println(listOfATMs);

        //generate rand atm from list of atms
        ATM atmRand = ATMMenu.generateRandomATM(listOfATMs);
        AtmService atmService = new AtmService(atmRand, fileHandler);
        //ask to select user or admin
        String person = ATMMenu.selectPerson(atmRand, fileHandler);

        if (person.equals("user")) {
            // User authorization
            User userAuthorized = AuthorizationService.userAuthorization(listOfUsers);
            //create user service for current user
            UserService userService = new UserService(userAuthorized, atmRand, fileHandler);
            System.out.println("User " + userAuthorized.getUserID() + " authorized!");
            //perform operations
            ATMMenu.performOperations(userService, atmService, userAuthorized);
        } else {
            System.out.println("Admin");
        }
    }


//
//        // Admin authorization and ATM loading money
//        authService.adminAuthorization(listOfAdmins);
//        atmService.loadMoney(5000);
//

//
}

