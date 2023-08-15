package com.softserve.Homework.hw_16.Task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        // Create file1.txt
        File file1 = new File("src\\com\\softserve\\Homework\\hw_16\\Task1\\file1.txt");
        FileWriter fileWriter = new FileWriter(file1);
        fileWriter.write("A programmer is someone who writes/creates computer software or applications generally by providing\n" +
                "instructions (commonly through the use of a specific programming language) to the computer or by\n" +
                "configuring already existing code (such as a framework or existing code base). Most programmers have\n" +
                "extensive computing and coding experience in many varieties of programming languages and platforms,\n" +
                "such as Structured Query Language (SQL), Perl, Extensible Markup Language (XML), PHP, HTML, C, C++\n" +
                "and Java.");
        fileWriter.close();

        // Read file1.txt into an array of strings
        List<String> lines = new ArrayList<>();
        FileReader fileReader = new FileReader(file1);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String Currentline;
        while ((Currentline = bufferedReader.readLine()) != null) {
            lines.add(Currentline);
        }
        bufferedReader.close();

        // Get the number of lines in file1.txt
        int numberOfLines = lines.size();

        // Get the longest line in file1.txt
        String longestLine = "";
        for ( String line : lines) {
            if (line.length() > longestLine.length()) {
                longestLine =line ;
            }
        }

        // Write to file2.txt
        File file2 = new File("src\\com\\softserve\\Homework\\hw_16\\Task1\\file2.txt");
        FileWriter fileWriter2 = new FileWriter(file2);
        fileWriter2.write("The number of lines in file1.txt is: " + numberOfLines + "\n");
        fileWriter2.write("The longest line in file1.txt is: " + longestLine + "\n");
        fileWriter2.write("My name is Yura, and my birthday date is 2005-05-24.");
        fileWriter2.close();
    }
}

