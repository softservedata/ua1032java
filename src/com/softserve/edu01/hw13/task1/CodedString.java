package com.softserve.edu01.hw13.task1;

import java.util.Scanner;

public class CodedString {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Print 3 letters: ");
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        String input3 = scanner.nextLine();
        String s = input1 + input2 + input3;
        System.out.print("Enter the number of positions to shift: ");
            int n = scanner.nextInt();

            String shiftedString = encrypt(s, n);
            System.out.println("Result: " + shiftedString);
            String decryptedText = decrypt(shiftedString, n);
            System.out.println("Decrypted: " + decryptedText);
        }

        public static String encrypt(String s, int n) {
            StringBuilder result = new StringBuilder();

            for (char c : s.toCharArray()) {
                if (Character.isLetter(c)) {
                    char base = Character.isLowerCase(c) ? 'a' : 'A';
                    char shiftedChar = (char) (base + (c - base + n) % 26);
                    result.append(shiftedChar);
                } else {
                    result.append(c);
                }
            }

            return result.toString();
        }
        public static String decrypt(String s, int n) {
            return encrypt(s, -n);
        }
}
