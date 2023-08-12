package com.softserve.edu.homework.homework_16_IO_Streams.task_2;

import javax.annotation.processing.FilerException;
import java.io.*;

public class СodeFile {
    public static void main(String[] args) {
        File firstFile = new File("src/com/softserve/edu/homework/homework_16_IO_Streams/task_2/initial_code.txt");
        File secondFile = new File("src/com/softserve/edu/homework/homework_16_IO_Streams/task_2/modified_code.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(firstFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(secondFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().startsWith("public class")) {
                    writer.write(line);
                    writer.newLine();
                } else {
                    line = line.replaceAll("\\bpublic\\b", "private");
                    writer.write(line);
                    writer.newLine();
                }
            }
            System.out.println("\u001B[32m" + "Changed initial_code.txt has been successfully rewritten to modified_code.txt" + "\u001B[0m");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (FilerException e) {
            System.err.println("The file contains a syntax error");
        } catch (Exception e) {
            System.err.println("Some other error");
        }
    }
}
