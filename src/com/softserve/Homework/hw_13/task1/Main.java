package com.softserve.Homework.hw_13.task1;
public class Main {
    public static void main(String[] args) {
        String encrypted = encrypt("abc", 3);
        System.out.println("Encrypted: " + encrypted);
        String decrypted = decrypt(encrypted, 3);
        System.out.println("Decrypted: " + decrypted);
    }

    public static String encrypt(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                int base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c + n - base) % 26 + base);
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, 26 - n);
    }
}
