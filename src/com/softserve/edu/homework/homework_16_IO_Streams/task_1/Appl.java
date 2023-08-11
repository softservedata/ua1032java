package com.softserve.edu.homework.homework_16_IO_Streams.task_1;

import java.io.*;

public class Appl {
    public static void main(String[] args) {
        File fileFirst = new File("src/com/softserve/edu/homework/homework_16_IO_Streams/task_1/file1.txt");
        File fileSecond = new File("src/com/softserve/edu/homework/homework_16_IO_Streams/task_1/file2.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileFirst));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileSecond))){
            String line;
            int count = 0;
            String longLine = "";
            int longline = 0;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
                count++;
                if(line.length() > longLine.length()){
                    longLine = line;
                    longline = line.length();
                }
                if (line.startsWith("Name : ")){
                    System.out.println(line);
                }
                if (line.startsWith("Birthday : ")){
                    System.out.println(line);
                }
            }
            System.out.println("Number of lines in the source file: " + count);
            System.out.println(longLine + "\t- the longest line that contains " + longline );

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("Some other error");
        }
    }
}
