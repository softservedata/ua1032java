package com.softserve.homework.homework16.task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Homework16_02 {
    // TODO: A file with java code is given.
    //      Read program text from file and all words public in the declaration of class attributes and
    //      methods should be replaced with the word private. Save the result to another previously created file.

    public static void main(String[] args) {
        String readFileName = "src/com/softserve/homework/homework16/task2/readCode.txt";
        String writeFileName = "src/com/softserve/homework/homework16/task2/writeCode.txt";
        List<String> lines = new ArrayList<>();
        List<String> fixedLines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(readFileName))) {
            String s;
            while ((s = br.readLine()) != null) {
                lines.add(s);
            }
            System.out.print("Code read from file \"" + readFileName + "\"");
        } catch (Exception e) {
            e.printStackTrace();
        }

        for(String line: lines) {
            fixedLines.add(line.replace("public", "private"));
        }
        System.out.println("\npublic\" -> \"private\"");

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(writeFileName))) {
            for(String line: fixedLines) bw.write(line + "\n");
            System.out.println("Code wrote to \"" + writeFileName + "\"");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
