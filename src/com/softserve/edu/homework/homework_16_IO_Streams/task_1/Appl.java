package com.softserve.edu.homework.homework_16_IO_Streams.task_1;

import javax.annotation.processing.FilerException;
import java.io.*;

public class Appl {
    public static void main(String[] args) {
        File fileFirst = new File("src/com/softserve/edu/homework/homework_16_IO_Streams/task_1/file1.txt");
        File fileSecond = new File("src/com/softserve/edu/homework/homework_16_IO_Streams/task_1/file2.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileFirst));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileSecond))) {
            String line;
            int count = 0;
            String longLine = "";
            int longline = 0;
            while ((line = reader.readLine()) != null) {
                count++;
                if (line.length() > longLine.length()) {
                    longLine = line;
                    longline = line.length();
                }
                if (line.startsWith("Name : ")) {
                    writer.write(line);
                    writer.newLine();
                }
                if (line.startsWith("Birthday : ")) {
                    writer.write(line);
                    writer.newLine();
                }
            }
            writer.write("The number of lines in the file file1.txt : " + count);
            writer.newLine();
            writer.write(longLine + "\t- the longest line that contains " + longline);
            System.out.println("\u001B[32m" + "All required data from file1.txt has been successfully written to file2.txt" + "\u001B[0m");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (FilerException e){
            System.err.println("The file contains a syntax error");
        }catch (Exception e) {
            System.err.println("Some other error");
        }
    }
}
