package com.softserve.homework.hw11.task1;

public class Sentence {
    public static String findLongestWord(String[] sentence){
        String longestWord = " ";
        if(sentence!=null) {
            for (String word : sentence) {
                if (longestWord.length() < word.length()) {
                    longestWord = word;
                }
            }
            return longestWord;
        }else return null;
    }

    public static int findLengthOfLongestWord(String[] sentence){
        String longestWord = findLongestWord(sentence);

        return longestWord.length();
    }

    public static  String reverseSecondWord(String[] sentence){

        String secondWord = sentence[1];

        StringBuilder secondWordSB = new StringBuilder(secondWord);
        return secondWordSB.reverse().toString();
    }
}
