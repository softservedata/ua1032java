package com.softserve.homework.hw11.task2;
/*
Іnput a sentence that contains words separated by more than one space on the console.
The goal is to replace all consecutive spaces with a single space.
For instance, if you entered the sentence "  I   am   learning   Java Fundamental    ",
the expected result should be "I am learning Java Fundamental ".

Введіть на консолі речення, яке містить слова, розділені кількома пробілами.
Мета полягає в тому, щоб замінити всі послідовні пробіли одним пробілом.
Наприклад, якщо ви ввели речення "  Я   вивчаю   Java   Fundamental  ",
очікуваним результатом має бути "Я вивчаю Java Fundamental".
 */


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class App {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        System.out.println(sentence.replaceAll("[ ]+", " "));
    }
}
