package com.softserve.homework.hw13.task2;

public class AppDate {
    public static void main(String[] args) {
        String dateString = "11.02.12";
        boolean isValidDate = DateValidator.checkIfDateIsValid(dateString);
        System.out.println("Is date: " + dateString + " valid? " + isValidDate);
    }
}
