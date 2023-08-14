package com.softserve.projectForGraduationATM.management;

import com.softserve.projectForGraduationATM.entities.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FileHandler {
    private final String usersFileName = "C:/java_soft/ua1032java/src/com/softserve/projectForGraduationATM/DataBase/users.txt";
    private final String adminsFileName = "C:/java_soft/ua1032java/src/com/softserve/projectForGraduationATM/DataBase/admins.txt";
    private final String atmFileName = "C:/java_soft/ua1032java/src/com/softserve/projectForGraduationATM/DataBase/atms.txt";
    private final String transactionsFileName = "C:/java_soft/ua1032java/src/com/softserve/projectForGraduationATM/DataBase/transactions.txt";

    public FileHandler() {
    }

    public void saveUser(User newUser) {
        List<User> usersList = loadUsers();

        // Check if the new user already exists in the list
        User existingUser = null;
        for (User user : usersList) {
            if (user.getUserID() == newUser.getUserID()) {
                existingUser = user;
                break;
            }
        }

        if (existingUser != null) {
            usersList.remove(existingUser);
        }

        // Only add the new user if it's not null or empty
        if (newUser != null && newUser.getUserID() != 0) {
            usersList.add(newUser);
        }

        try {
            List<String> userLines = usersList.stream().sorted(Comparator.comparingInt(User::getUserID)) // Sort by ID in ascending order
                    .map(this::userToString).collect(Collectors.toList());
            Files.write(Paths.get(usersFileName), userLines, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void saveAdmin(Admin newAdmin) {
        List<Admin> adminsList = loadAdmins();

        Admin existingAdmin = null;

        for (Admin admin : adminsList) {
            if (admin.getAdminID() == newAdmin.getAdminID()) {
                existingAdmin = admin;
                break;
            }
        }

        if (existingAdmin != null) {
            adminsList.remove(existingAdmin);
        }


        adminsList.add(newAdmin);

        try {

            List<String> adminsLines = adminsList.stream().sorted(Comparator.comparingInt(Admin::getAdminID)) // Sort by ID in ascending order
                    .map(this::adminToString).collect(Collectors.toList());
            Files.write(Paths.get(adminsFileName), adminsLines, StandardOpenOption.CREATE);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveATM(ATM newAtm) {
        List<ATM> ATMsList = loadATMs();

        ATM existingATM = null;

        for (ATM atm : ATMsList) {
            if (atm.getAtmID() == newAtm.getAtmID()) {
                existingATM = atm;
                break;
            }
        }

        if (existingATM != null) {
            ATMsList.remove(existingATM);
        }


        ATMsList.add(newAtm);

        try {

            List<String> ATMsLines = ATMsList.stream().sorted(Comparator.comparingInt(ATM::getAtmID)) // Sort by ID in ascending order
                    .map(this::atmToString).collect(Collectors.toList());
            Files.write(Paths.get(atmFileName), ATMsLines, StandardOpenOption.CREATE);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveTransaction(Transaction transaction) {
        try {
            String transactionString = transactionToString(transaction);
            List<String> transactionLine = Collections.singletonList(transactionString);
            Files.write(Paths.get(transactionsFileName), transactionLine, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<User> loadUsers() {
        List<User> users = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(usersFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim(); // Remove leading and trailing whitespace
                if (!line.isEmpty()) {
                    users.add(parseUser(line));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }


    public List<Admin> loadAdmins() {
        List<Admin> admins = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(adminsFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim(); // Remove leading and trailing whitespace
                admins.add(parseAdmin(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return admins;
    }

    public List<ATM> loadATMs() {
        List<ATM> atms = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(atmFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim(); // Remove leading and trailing whitespace
                atms.add(parseATM(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return atms;
    }

    public List<Transaction> loadTransactions() {
        List<Transaction> transactions = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(transactionsFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                transactions.add(parseTransaction(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return transactions;
    }

    private String userToString(User user) {
        return user.getUserID() + "," + user.getName() + "," + user.getPin() + "," + user.getBalance();
    }

    private String adminToString(Admin admin) {
        return admin.getAdminID() + "," + admin.getName() + "," + admin.getPin() + "," + admin.getPassword();
    }

    private String atmToString(ATM atm) {
        return atm.getAtmID() + "," + atm.getLocation() + "," + atm.getBalance();
    }

    private String transactionToString(Transaction transaction) {
        return transaction.getTransactionID() + "," + transaction.getTimestamp() + "," + transaction.getUserID() + "," + transaction.getTransactionType() + "," + transaction.getAmount();
    }

    private User parseUser(String line) {
        String[] parts = line.split(",");
        int userId = Integer.parseInt(parts[0]);
        FullName name = parseFullName(parts[1]);
        int pin = Integer.parseInt(parts[2]);
        double balance = Double.parseDouble(parts[3]);
        return new User(userId, name, pin, balance);
    }

    private Admin parseAdmin(String line) {
        String[] parts = line.split(",");
        int adminId = Integer.parseInt(parts[0]);
        FullName name = parseFullName(parts[1]);
        int pin = Integer.parseInt(parts[2]);
        String password = parts[3];
        return new Admin(adminId, name, pin, password);
    }

    private ATM parseATM(String line) {
        String[] parts = line.split(",");
        int atmId = Integer.parseInt(parts[0]);
        String location = parts[1];
        int balance = Integer.parseInt(parts[2]);
        return new ATM(atmId, location, balance);
    }

    private Transaction parseTransaction(String line) {
        String[] parts = line.split(",");
        int transactionId = Integer.parseInt(parts[0]);
        LocalDateTime timestamp = LocalDateTime.parse(parts[1]);
        int userId = Integer.parseInt(parts[2]);
        TransactionType transactionType = TransactionType.valueOf(parts[3]);
        int amount = Integer.parseInt(parts[4]);
        return new Transaction(transactionId, timestamp, userId, transactionType, amount);
    }

    private FullName parseFullName(String fullNameString) {
        String[] parts = fullNameString.split(" ");
        String firstName = parts[0];
        String lastName = parts[1];
        return new FullName(firstName, lastName);
    }

    public List<Transaction> loadTransactionsByUserId(int userID) {
        List<Transaction> transactions = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(transactionsFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Transaction transaction = parseTransaction(line);
                if (transaction.getUserID() == userID) {
                    transactions.add(transaction);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return transactions;
    }

//    public List<Transaction> loadTransactionsByAtmID(int atmID) {
//        List<Transaction> transactions = new ArrayList<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader(transactionsFileName))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                Transaction transaction = parseTransaction(line);
//                if (transaction.getAtmID() == atmID) {
//                    transactions.add(transaction);
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return transactions;
//    }


}

