package com.softserve.edu.homework.homework_13_Functional_Interfaces.task_1;

public class CodedString {
    public static String encrypt(String s, int n) {
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            char coded_letter = (char) (letter + n);
            s = s.replace(letter, coded_letter);
        }
        return s;
    }

    public static String decrypt(String s, int n) {
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            char coded_letter = (char) (letter - n);
            s = s.replace(letter, coded_letter);
        }
        return s;
    }
}
