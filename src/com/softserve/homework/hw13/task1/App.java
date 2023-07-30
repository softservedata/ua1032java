package com.softserve.homework.hw13.task1;
/*
Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
Method encrypt should take a string and return coded string where every letter is moved on n positions in alphabet
(e.g. encrypt("abc", 3) returns "def“).
Method decrypt should return decoded value

Створіть два методи String encrypt(String s, int n) і String decrypt(Stirng s, int n)
Метод encrypt повинен приймати рядок і повертати закодований рядок, де кожна літера переміщена на n позицій в алфавіті
(наприклад, encrypt("abc", 3) повертає "def“).
Метод decrypt має повертати декодоване значення

 */


public class App {
    private static final char[] ALPHABET = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                                            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static String encrypt ( String s, int n ) {
        StringBuilder encryptedString = new StringBuilder( );

        for (int i = 0; i < s.length( ); i++) {
            char originalChar = s.charAt( i );
            char encryptedChar = (char) (originalChar + n);

                    // Checking if the limit of the alphabet is exceeded
                    if ( (Character.isLowerCase( originalChar ) && encryptedChar > 'z') ) {
                        encryptedChar -= 26;
                    } else if ( (Character.isLowerCase( originalChar ) && encryptedChar < 'a') ) {
                        encryptedChar += 26;
                    }

            encryptedString.append( encryptedChar );
        }

        return encryptedString.toString( );
    }

    public static String decrypt ( String s, int n ) {
        return encrypt( s, -n );
    }

    public static void main ( String[] args ) {
        String originalMessage = "xyz";
        int shift = 3;

        String encryptedMessage = encrypt( originalMessage, shift );
        System.out.println( "Encrypted: " + encryptedMessage );

        String decryptedMessage = decrypt( encryptedMessage, shift );
        System.out.println( "Decrypted: " + decryptedMessage );
    }
}