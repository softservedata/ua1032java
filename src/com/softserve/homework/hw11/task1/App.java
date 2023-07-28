package com.softserve.homework.hw11.task1;
/*
The task involves inputting a sentence of five words through the console.
The following actions must be performed:
� Identify the longest word in the sentence and display it on the console.
� Determine the number of letters in the longest word.
� Display the second word of the sentence in reverse order on the console.

�������� ��������� �������� ������� � ���� ��� ����� �������.
��������� �������� ��� 䳿:
� �������� �������� ����� � ������ �� ������� ���� �� �������.
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

        //_____
        theLongestWord = sentence.get(0);

        for (String word : sentence) {
            if (word.length() > theLongestWord.length()) {
                theLongestWord = word;
            }
        }
        System.out.println("The longest word is: " + "\"" + theLongestWord + "\"" + " It has: " + theLongestWord.length() + " letters");

        //____
        StringBuilder stringBuilder = new StringBuilder(sentence.get(1));
        System.out.println("Reverse second word: " + stringBuilder.reverse());

        scanner.close();
    }
}
// Need to add a check for the number of words and display an error message if not enough words are entered.
// This is because there will be an exception when trying to access a list element that doesn't exist.

// Instead of using a regular expression to extract words, you could use the split() method,if words are separated by spaces.
// But your approach is more versatile.

// It's better to use ArrayList to store words in a list.

// Instead of concatenating strings, you can use String.format() for clearer string formatting.
