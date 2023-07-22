package com.softserve.hw.lesson11;

import com.softserve.hw.lesson11.task1.SentenceFiveWords;
import com.softserve.hw.lesson11.task2.DoubleSpace;
import com.softserve.hw.lesson11.task3.CurrencyTemplate;

import java.util.Scanner;

public class mainLesson11 {
    public static void main(String[] args) {
        System.out.println("task1");
        System.out.println("Please input sentence");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String maxWord = SentenceFiveWords.seekTheLongerWord(sentence);
        System.out.printf("The longest word in the sentence: \"%s\", its length %d\n", maxWord, maxWord.length());
        System.out.printf("Second word revers: %s\n", SentenceFiveWords.reversSecondWord(sentence));
        System.out.println("-".repeat(60));

        System.out.println("task2");
        System.out.println("Please input sentence");
        System.out.println(DoubleSpace.reverseOneSpace(sc.nextLine()));
        System.out.println("-".repeat(60));

        System.out.println("task3");
        CurrencyTemplate.checkPattern();
    }
}
/*I,  am  learning Java Fundamental*/
/*I, am learning Java Fundamental*/
