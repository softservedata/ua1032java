package homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FirstTask {
    public static void main(String[] args) {
        String file = "/Users/zz/Desktop/course/JavaFundamentals/Homework/ua1032java/Lesson16/src/homework/file1.txt";
        String file0 = "/Users/zz/Desktop/course/JavaFundamentals/Homework/ua1032java/Lesson16/src/homework/file2.txt";
        File file1=new File(file);
        File file2=new File(file0);

        System.out.println("Program Start");
        List<String> lines = readLinesFromFile(file1);
        writeToFile(file2, "Number of lines in file1.txt: " + lines.size());
        String longestLine = findLongestLine(lines);
        writeToFile(file2, "Longest line in file1.txt: " + longestLine);

        writeToFile(file2,"Name: Roman");
        writeToFile(file2,"Birthday: 30.11.2003");

        System.out.println("Program finish. Check file2. ");
    }

    public static String findLongestLine(List<String> lines) {
        String longestLine = "";
        for (String line : lines) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }
        return longestLine;
    }

    public static List<String> readLinesFromFile(File filename) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static void writeToFile(File filename, String content) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))) {
            bw.write(content);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
