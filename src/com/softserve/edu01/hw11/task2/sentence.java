package com.softserve.edu01.hw11.task2;

public class sentence {
    public static void main(String[] args) {
        String sentence = "I  am  learning  Java  Fundamental";

        String cleanedSentence = replaceMultipleSpaces(sentence);
        System.out.println("Результат: " + cleanedSentence);
    }
    public static String replaceMultipleSpaces(String sentence) {
        return sentence.replaceAll("\\s+", "");
    }
}
