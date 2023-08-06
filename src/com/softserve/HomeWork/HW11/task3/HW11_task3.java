package com.softserve.HomeWork.HW11.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW11_task3 {
    public static Scanner scanner = new Scanner(System.in);

    public static List<String> findPattern(String text) {
        List<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{2}");
        Matcher matcher = pattern.matcher(text);
        
        while (matcher.find()) {
            list.add(matcher.group());
        }

        return list;
    }
    public static void main(String[] args) {
        System.out.print("Text: ");
        String inputText = scanner.nextLine();
        scanner.close();//не обов'язково, він у тебе статичний тому точно закриється в кінці відпрацювання класу

        List<String> list = findPattern(inputText);

        System.out.println(list);
    }
}
