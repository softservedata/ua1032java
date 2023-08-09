package com.softserve.projectForGraduation.CashMachine;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileHandler {
    private String usersFileName = "C:/java_soft/ua1032java/src/com/softserve/projectForGraduation/CashMachine/DataBase/users.txt";
    private String adminsFileName = "C:/java_soft/ua1032java/src/com/softserve/projectForGraduation/CashMachine/DataBase/admins.txt";
    private String atmFileName = "C:/java_soft/ua1032java/src/com/softserve/projectForGraduation/CashMachine/DataBase/atms.txt";
    private String transactionsFileName = "C:/java_soft/ua1032java/src/com/softserve/projectForGraduation/CashMachine/DataBase/transactions.txt";

    public FileHandler() {
    }

    public void saveUser(User user) {
        try {
            String userString = userToString(user);
            List<String> userLine = Collections.singletonList(userString);
            Files.write(Paths.get(usersFileName), userLine, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveAdmin(Admin admin) {
        try {
            String adminString = adminToString(admin);
            List<String> adminLine = Collections.singletonList(adminString);
            Files.write(Paths.get(adminsFileName), adminLine, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveATM(ATM atm) {
        try {
            String atmString = atmToString(atm);
            List<String> atmLine = Collections.singletonList(atmString);
            Files.write(Paths.get(atmFileName), atmLine, StandardOpenOption.APPEND);
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
                users.add(parseUser(line));
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
        return transaction.getTransactionID() + "," + transaction.getTimestamp() + "," +
                transaction.getUserID() + "," + transaction.getTransactionType() + "," + transaction.getAmount();
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

}
