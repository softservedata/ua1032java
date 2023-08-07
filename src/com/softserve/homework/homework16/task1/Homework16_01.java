package com.softserve.homework.homework16.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Homework16_01 {
    // TODO: Create file1.txt file with a text about your career.
    //      Read context from file into array of strings.
    //      Each array item contains one line from file. Write in to the file2.txt
    //      1) number of lines in file1.txt.
    //      2) the longest line in file1.txt.
    //      3) your name and birthday date.

    public static void main(String[] args) {
        String readFileName = "src/com/softserve/homework/homework16/task1/file1.txt";
        String writeFileName = "src/com/softserve/homework/homework16/task1/file2.txt";
        List<String> lines = new ArrayList<>();
        String longestLine = "";

        try (BufferedReader br = new BufferedReader(new FileReader(readFileName))) {
            String s;
            while ((s = br.readLine()) != null) {
                lines.add(s);
                if(longestLine.length() < s.length()) longestLine = s;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(writeFileName))) {
            bw.write("Number of lines: " + lines.size() + "\n");
            bw.write("Longest line is \"" + longestLine + "\"\n");
            bw.write("Birthday: Maksym, 1 May");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
