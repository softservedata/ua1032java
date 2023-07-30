package com.softserve.homework.hw13.task1;

public class Encoder {
    //Method encrypt should take a string and return coded string
    // where every letter is moved on n positions in alphabet
    // (e.g. encrypt("abc", 3) returns "def“)
    public static String encrypt(String userString, int n) {
        if (userString != null) {
            StringBuilder encryptedString = new StringBuilder();
            for (char letter : userString.toCharArray()) {
                if (Character.isLetter(letter)) {
                    char encryptedLetter = (char) (letter + n);
                    if (encryptedLetter > 'z') {
                        encryptedLetter -= 26;
                    }
                    encryptedString.append(encryptedLetter);
                }else {
                    encryptedString.append(letter);
                }
            }
            return encryptedString.toString();
        }else {
            return null;
        }
    }
}
