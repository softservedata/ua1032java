package com.softserve.projectForGraduation.CashMachine;

import java.sql.Timestamp;

public class Transaction {
    private int transactionID;
    private Timestamp timestamp;
    private int userID;
    private String type; //withdraw or load money
    private int amount;
}
