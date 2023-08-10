package com.softserve.hw.lesson16.task2;

import java.io.*;

public class Cla {
    public static void method(File file, File file2) {
        try (BufferedReader br = new BufferedReader(new FileReader(file));
             BufferedWriter bw = new BufferedWriter(new FileWriter(file2))) {
            String s;
            while ((s = br.readLine()) != null) {
                String privateLine = s.replaceAll("\\bpublic\\b", "private");
                bw.write(privateLine);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
