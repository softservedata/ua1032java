package com.softserve.homework.homework13.task1;

public class Homework13_01 {
    // TODO: Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
    //      Method encrypt should take a string and return coded string where every letter is moved
    //      on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should
    //      return decoded value

    public static String encrypt(String s, int n) {
        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            char replaceL = (char) (letter + n);
            s = s.replace(letter, replaceL);
        }

        return s;
    }

    public static String decode(String s, int n) {
        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            char replaceL = (char) (letter - n);
            s = s.replace(letter, replaceL);
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println(encrypt("abc", 3));
        System.out.println(decode("def", 3)) ;
    }
}
