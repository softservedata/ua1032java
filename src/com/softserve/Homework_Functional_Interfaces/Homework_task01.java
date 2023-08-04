package com.softserve.Homework_Functional_Interfaces;

public class Homework_task01 {
    public static String encrypt(String s, int n) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char encryptedChar = (char) (base + (c - base + n) % 26);
                encrypted.append(encryptedChar);
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, 26 - (n % 26)); // Decryption is just the inverse of encryption with 26 as the modulo
    }

    public static void main(String[] args) {
        String message = "Hello, World!";
        int shift = 3;

        String encryptedMessage = encrypt(message, shift);
        System.out.println("Encrypted: " + encryptedMessage);

        String decryptedMessage = decrypt(encryptedMessage, shift);
        System.out.println("Decrypted: " + decryptedMessage);
    }