package com.softserve.projectForGraduationATM.management;

import com.softserve.projectForGraduationATM.entities.*;


import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ATMMenu {
    public static String selectPerson(ATM atmRand, FileHandler fileHandler) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to ATM: " + atmRand.getAtmID() + " " + atmRand.getLocation() );
        System.out.println("""
                Whom would you like to authorize:\s
                1) user\s
                2) admin\s""");

        int person;
        do {
            System.out.print("\nPress 1 or 2: ");
            String input = sc.nextLine();
            try {
                person = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                person = 0; // Set an invalid value to continue the loop
            }
        } while (person != 1 && person != 2);
        if (person == 1) {
            return "user";
        } else {
            return "admin";
        }
    }

    public static ATM generateRandomATM(List<ATM> listOfATMs) {
        Random random = new Random();
        // Generate a random number between 1 and 10
        int randomNumb = random.nextInt(listOfATMs.size()) - 1;
        ATM atmRand = ATM.getATMByID(listOfATMs, randomNumb);
        if (atmRand == null) {
            System.out.println("Error! try again");
            System.exit(0);
        }
        return atmRand;
    }

    //user
    public static void performUserOperations(UserService userService, AtmService atmService, User userAuthorized) {
        Scanner sc = new Scanner(System.in);
        int operation = 0;
        do {
            System.out.println("""
                    What operation would you like to do?
                    1) Check balance
                    2) Withdraw money
                    3) Load money
                    4) View list of transactions
                    5) Exit""");

            operation = sc.nextInt();

            switch (operation) {
                case 1 -> {
                    System.out.println("Balance: " + userService.checkUserBalance());
                    //sc.next();
                }
                case 2 -> {
                    System.out.print("Enter the amount to withdraw: ");
                    int amount = sc.nextInt();
                    boolean withdrawSuccess = userService.withdrawMoney(amount);
                    if (withdrawSuccess) {
                        System.out.println("Withdrawal successful");
                    } else {
                        System.out.println("Withdrawal failed. Insufficient balance or ATM balance.");
                    }
                    //sc.next();
                }
                case 3 -> {
                    System.out.print("Enter the amount to load: ");
                    int amount = sc.nextInt();
                    atmService.loadMoneyToCard(amount, userAuthorized);
                    System.out.println("Money loaded successfully");
                    //sc.next();
                }
                case 4 -> {
                    List<Transaction> transactions = userService.viewTransactionHistory();
                    for (Transaction transaction : transactions) {
                        System.out.println(transaction);
                    }
                    //sc.next();
                }
                case 5 -> {
                    System.out.println("Exiting...");
                }
                default -> System.out.println("Invalid operation. Please enter a number between 1 and 5.");
            }
        } while (operation != 5);
        sc.close();
    }

    //admin
//    public static void performAdminOperation(AdminService adminService, AtmService atmService, Admin adminAuthorized) {
//
//        int operation = 0;
//        do {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("""
//                    What operation would you like to do?
//                    1) Check balance
//                    2) Load money
//                    3) Exit""");
//
//            operation = Integer.parseInt(sc.nextLine());
//
//            switch (operation) {
//                case 1 -> {
//                    System.out.println("Balance: " + adminService.checkATMBalance());
//                    //sc.next();
//                }
//                case 2 -> {
//                    System.out.print("Enter the amount to load: ");
//                    int amount = Integer.parseInt(sc.nextLine());
//                    atmService.loadMoney(amount);
//                    System.out.println("Money loaded successfully");
//                    //sc.next();
//                }
////                case 3 -> {
////                    List<Transaction> transactions = adminService.viewATMTransactionHistory();
////                    for (Transaction transaction : transactions) {
////                        System.out.println(transaction);
////                    }
////                    //sc.next();
////                }
//                case 3 -> {
//                    System.out.println("Exiting...");
//                }
//                default -> System.out.println("Invalid operation. Please enter a number between 1 and 5.");
//            }
//            sc.close();
//        } while (operation !=3);
//    }

    public static void performAdminOperations(AdminService adminService, AtmService atmService, Admin adminAuthorized) {
        Scanner sc = new Scanner(System.in);
        int operation = 0;
        do {
            System.out.println("""
                    \nWhat operation would you like to do?
                    1) Check balance
                    2) Load money
                    3) Exit
                    """);

            operation = sc.nextInt();

            switch (operation) {
                case 1 -> {
                    System.out.println("Balance: " + adminService.checkATMBalance());
                    //sc.next();
                }
                case 2 -> {
                    System.out.print("Enter the amount to load: ");
                    int amount = sc.nextInt();
                    atmService.loadMoney(amount);
                    System.out.println("Money loaded successfully");
                    //sc.next();
                }
                case 3 -> {
                    System.out.println("Exiting...");
                }
                default -> System.out.println("Invalid operation. Please enter a number between 1 and 3.");
            }
        } while (operation != 3);
        sc.close();
    }
}
