package com.softserve.projectForGraduationATM.management;

import com.softserve.projectForGraduationATM.entities.*;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AuthorizationService {
    public AuthorizationService() {
    }

    //User authorization
    public static User checkValidUserAuthorizationData(int userID, int pin, List<User> listOfUsers) {
        for (User user : listOfUsers) {
            if (userID == user.getUserID() && pin == user.getPin()) {
                return user;
            }
        }
        return null;
    }

    // If user inputs incorrect pin or user id 5 times, the method stops and returns null
    public static User userAuthorization(List<User> listOfUsers) {
        Scanner sc = new Scanner(System.in);
        User userAuthorized = null;
        int countOfTries = 0;
        int userId;
        int pin;
        do {
            try {
                System.out.print("Input your user's id: ");
                userId = Integer.parseInt(sc.nextLine());

                System.out.print("Input pin to id " + userId + ": ");
                pin = Integer.parseInt(sc.nextLine());
                //assign value if user was found
                userAuthorized = checkValidUserAuthorizationData(userId, pin, listOfUsers);
                if (userAuthorized == null) {
                    countOfTries++;
                    System.out.println("Invalid user ID or PIN. Remaining tries: " + (5 - countOfTries));
                    if (countOfTries>=5){
                        System.exit(0);
                    }
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter valid integers.");
                sc.nextLine();
            }
        } while (countOfTries < 5);
        return userAuthorized;
    }


    //Admin authorization
    public Admin checkValidAdminAuthorizationData(int adminID, int pin, String password, List<Admin> listOfAdmins) {
        for (Admin admin : listOfAdmins) {
            if (adminID == admin.getAdminID() && pin == admin.getPin() && password.equals(admin.getPassword())) {
                return admin;
            }
        }
        return null;
    }

    // If user inputs incorrect pin or user id 5 times, the method stops and returns null
    public Admin adminAuthorization(List<Admin> listOfAdmins) {
        Scanner sc = new Scanner(System.in);
        Admin adminAuthorized = null;
        int countOfTries = 0;
        int adminId;
        int pin;
        String password;
        do {
            try {
                System.out.print("Input your admins' id: ");
                adminId = sc.nextInt();

                System.out.print("Input pin to id " + adminId + ": ");
                pin = sc.nextInt();

                System.out.print("Input password to id  " + adminId + ": ");
                password = sc.nextLine();
                //assign value if admin was found
                adminAuthorized = checkValidAdminAuthorizationData(adminId, pin, password, listOfAdmins);
                if (adminAuthorized == null) {
                    countOfTries++;
                    System.out.println("Invalid admin ID or PIN. Remaining tries: " + (5 - countOfTries));
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter valid data.");
                sc.nextLine();
            }
        } while (countOfTries < 5);

        sc.close();
        return adminAuthorized;
    }
}
