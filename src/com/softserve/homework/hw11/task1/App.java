package com.softserve.homework.hw11.task1;
/*
The task involves inputting a sentence of five words through the console.
The following actions must be performed:
� Identify the longest word in the sentence and display it on the console.
� Determine the number of letters in the longest word.
� Display the second word of the sentence in reverse order on the console.

�������� ��������� �������� ������� � ���� ��� ����� �������.
��������� �������� ��� 䳿:
� �������� �������� ����� � ������� �� ������� ���� �� �������.
� ������ ������� ���� � ���������� ����.
� ������� �� ������� ����� ����� ������� � ���������� �������.

 */

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String theLongestWord;

        List<String> sentence = new LinkedList<>();

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\b[a-zA-Z']+\\b");
        Matcher matcher = pattern.matcher(text);

        System.out.println();

        while (matcher.find()) {
            sentence.add(text.substring(matcher.start(), matcher.end()));
        }

        //___________________________________________________________________________________________________
        theLongestWord = sentence.get(0);

        for (String word: sentence) {
            if (word.length() > theLongestWord.length()){
                theLongestWord = word;
            }
        }
        System.out.println("The longest word is: " + "\"" + theLongestWord + "\"" + " It has: " + theLongestWord.length() + " letters");

        //___________________________________________________________________________________________________
        StringBuilder stringBuilder = new StringBuilder(sentence.get(1));
        System.out.println("Reverse second word: " + stringBuilder.reverse());

        scanner.close();
    }
}
