package com.softserve.projectForGraduation.CashMachine;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Transaction {
    private int transactionID;
    private LocalDateTime timestamp;
    private int userID;
    private TransactionType type; //withdraw or load money
    private int amount;

    public Transaction(int transactionID, LocalDateTime timestamp, int userID, TransactionType type, int amount) {
        this.transactionID = transactionID;
        this.timestamp = timestamp;
        this.userID = userID;
        this.type = type;
        this.amount = amount;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public TransactionType getTransactionType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionID=" + transactionID +
                ", timestamp=" + timestamp +
                ", userID=" + userID +
                ", type=" + type +
                ", amount=" + amount +
                '}';
    }
}
