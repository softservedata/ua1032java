package com.softserve.homework.hw13.task1;

public class AppEncoding {
    public static void main(String[] args) {
        String userString = "abc yz";
        int n = 1; // count of position to move letter in alphabet
        System.out.println("Original string: " + userString);

        //encode string
        String encodedString = Encoder.encrypt(userString, n);
        System.out.println("Encoded string: " + encodedString);

        //decode string
        String decodedString = Decoder.decode(encodedString, n);
        System.out.println("Decoded string: " + decodedString);

        //compare strings if methods work correctly
        boolean isEqual = userString.equals(decodedString);
        System.out.println("Methods work correctly?: " + isEqual);
    }
}
