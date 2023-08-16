package com.softserve.hw.lesson16.task1;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelperFile {
    public static void seekNumberOfLineAndMaxLine(File one, File two) {
        try (BufferedReader br = new BufferedReader(new FileReader(one));
             BufferedWriter bw = new BufferedWriter(new FileWriter(two,true))) {

            int counter = 0;
            String line;
            String longLine = " ";
            while ((line = br.readLine()) != null) {
                if (line.length() > longLine.length()) {
                    longLine = line;
                }
                counter++;
            }
            bw.write("Number of lines " + counter);
            bw.newLine();
            bw.write("Longest Line: " + longLine);
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void seekBerthDay(File one, File two) {
        String regax = "April 19, 2003";
        Pattern pattern = Pattern.compile(regax);
        try (BufferedReader br = new BufferedReader(new FileReader(one));
             BufferedWriter bw = new BufferedWriter(new FileWriter(two, true))) {
            String line;
            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    bw.write(line);
                    bw.newLine();
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
