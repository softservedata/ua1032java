package com.softserve.homework.hw13.task1;

public class Decoder {
    public static String decode(String encodedString, int n) {
        if (encodedString != null) {
            StringBuilder decodedString = new StringBuilder();
            for (char letter : encodedString.toCharArray()) {
                if (Character.isLetter(letter)) {
                    char decodedLetter = (char) (letter - n);
                    if (decodedLetter < 'a') {
                        decodedLetter += 26;
                    }
                    decodedString.append(decodedLetter);
                } else {
                    decodedString.append(letter);
                }
            }
            return decodedString.toString();
        } else {
            return null;
        }
    }
}
