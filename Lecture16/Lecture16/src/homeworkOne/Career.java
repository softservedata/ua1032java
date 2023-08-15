package homeworkOne;

/* Create file1.txt file with a text about your career.
   Read context from file into array of strings. Each array item contains one line from file. Write in to the file2.txt
   1) number of lines in file1.txt.
   2) the longest line in file1.txt.
   3) your name and birthday date. */

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Career {
    public final static String CAREER =
            "I am 18. " +
                    "I am a second year student at Lviv National University at the faculty of Computer Science. " +
                    "I am currently studying a programming Java Fundamentals course at SoftServe University that I really adore." +
                    "I have already finished HTML & CSS & JS course and I am going to attend all parts of the Java Developer course. " +
                    "Also I am actively studying and improving my English skills, therefore, I suppose my level is B2 now. ";

    public static void main(String[] args) {
        String file1 = "/Users/irynavdovych/Desktop/iryna/file1.txt";
        String file2 = "/Users/irynavdovych/Desktop/iryna/file2.txt";
        Path path1 = Path.of(file1);
        Path path2 = Path.of(file2);

        try (BufferedWriter writer1 = Files.newBufferedWriter(path1, StandardOpenOption.CREATE)) {
            writer1.write(CAREER);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<String> lines = null;
        try {
            lines = Files.readAllLines(path1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedWriter writer2 = Files.newBufferedWriter(path2, StandardOpenOption.CREATE)) {
            writer2.write("The quantity of lines is : " + lines.size());
            writer2.newLine();

            String longestLine = lines.stream().max(Comparator.comparing(String::length)).orElse("");
            writer2.write("The longest line is: " + longestLine);
            writer2.newLine();

            writer2.write("Iryna");
            writer2.newLine();
            LocalDate birthday = LocalDate.of(2004, 12, 27);
            writer2.write("Birthday date: " + birthday);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(Files.readString(path2, StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}