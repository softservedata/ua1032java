package com.softserve.homework.hw11.task3;
/*
The task requires implementation of a pattern to match US currency format, which includes a
dollar sign ($) followed by any number of digits, a dot, and two digits after the dot.
The next step is to input a text containing several instances of US currency format via the console.
Finally, display all the occurrences of US currency format on the console screen.

Завдання вимагає впровадження шаблону для відповідності формату валюти США, який включає a
знак долара ($), після якого йде будь-яка кількість цифр, крапка та дві цифри після крапки.
Наступним кроком є введення тексту, що містить кілька екземплярів формату валюти США, через консоль.
Нарешті, відобразіть усі випадки формату валюти США на екрані консолі.
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class App {
    public static void main ( String[] args ) {
        Pattern pattern = Pattern.compile("[$][\\d]+[.][\\d]{2}");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()) {
            System.out.print(sentence.substring(matcher.start(), matcher.end()) + "\n");
        }
    }
}