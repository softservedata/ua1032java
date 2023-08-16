package com.softserve.hw.lesson11.task1;

public class SentenceFiveWords {
    public static String seekTheLongerWord(String sentence) {
        String[] split = sentence.split("\\W+");
        String max = split[0];
        for (String strings : split) {
            if (strings.length() > max.length()) {
                max = strings;
            }
        }
        return max;
    }
    public static String reversSecondWord(String sentence){
        String[] split = sentence.split("\\W+");
        return new StringBuffer(split[1]).reverse().toString();
    }
}
