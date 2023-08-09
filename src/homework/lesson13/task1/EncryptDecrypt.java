package homework.lesson13.task1;

import homework.lesson12.task2.WrongInputException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EncryptDecrypt {
    public static String encrypt(String s, int n) {
        for (int i = 0; i < s.length(); i++) {
            char temp = (char) (s.charAt(i) + n);
            s = s.replace(s.charAt(i), temp);
        }
        return s;
    }

    public static String decrypt(String s, int n) {
        for (int i = 0; i < s.length(); i++) {
            char temp = (char) (s.charAt(i) - n);
            s = s.replace(s.charAt(i), temp);
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input some text to encrypt to Caesar Cipher : ");
            String input = sc.nextLine();

            System.out.print("Key : ");
            int key = sc.nextInt();
            if (key > 26) throw new WrongInputException("Key can't be greater than 26!");

            System.out.println("Encrypted: " + encrypt(input, key));
            input = encrypt(input, key);
            System.out.println("Decrypted: " + decrypt(input, key));

        } catch (InputMismatchException e) {
            System.out.println("Error, please, input correct data!");
        } catch (WrongInputException e) {
            System.out.println(e.getMessage());
        }
        sc.close();

    }
}
