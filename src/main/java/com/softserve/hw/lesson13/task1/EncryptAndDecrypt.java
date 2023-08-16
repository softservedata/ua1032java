package com.softserve.hw.lesson13.task1;

public class EncryptAndDecrypt {
    public static String encrypt(String userString, int n) {
        StringBuilder sb = new StringBuilder();
        if (userString != null) {
            for (char chars : userString.toCharArray()) {
                if (Character.isLetter(chars)) {
                    char base = Character.isUpperCase(chars) ? 'A' : 'a';
                    char encryptedChar = (char) ((chars - base + n) % 26 + base);
                    sb.append(encryptedChar);
                } else {
                    sb.append(chars);
                }
            }
            return sb.toString();
        } else {
            return null;
        }
    }

    public static String decrypt(String userString, int n) {
        if (userString != null) {
            StringBuilder sb = new StringBuilder();
            for (char chars : userString.toCharArray()) {
                if (Character.isLetter(chars)) {
                    char base = Character.isUpperCase(chars) ? 'A' : 'a';
                    char decryptedChar = (char) ((chars - base - n + 26) % 26 + base);
                    sb.append(decryptedChar);
                } else {
                    sb.append(chars);
                }
            }
            return sb.toString();
        } else {
            return null;
        }
    }
}
