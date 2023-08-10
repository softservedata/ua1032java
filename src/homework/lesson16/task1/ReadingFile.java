package homework.lesson16.task1;

import java.io.*;

public class ReadingFile {


    public static void main(String[] args) throws IOException {
        File file = new File("src/homework/lesson16/task1/file1.txt");
        BufferedReader fileReader = new BufferedReader(new FileReader(file));

        String line = null;
        int countLines = 0;
        String longestLine = "";
        while ((line = fileReader.readLine()) != null) {
            System.out.println(line);
            if (line.length() > longestLine.length())
                longestLine = line;
            countLines++;
        }

        File file2 = new File("src/homework/lesson16/task1/file2.txt");
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file2));

        fileWriter.write("There are " + countLines + " lines");
        fileWriter.write("\nLongest line: " + longestLine);
        fileWriter.write("\nSasha " + "21.11");

        fileReader.close();
        fileWriter.close();
    }
}
