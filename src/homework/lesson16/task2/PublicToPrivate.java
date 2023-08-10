package homework.lesson16.task2;

import java.io.*;

public class PublicToPrivate {
    public static void main(String[] args) throws IOException {
        File file = new File("src/homework/lesson16/task2/readFromThis.txt");
        File file2 = new File("src/homework/lesson16/task2/writeToThis.txt");
        BufferedReader fileReader = new BufferedReader(new FileReader(file));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file2));

        String line;
        while ((line = fileReader.readLine()) != null) {
            if (line.contains("public")) {
                String newLine = line.replace("public", "private");
                fileWriter.write(newLine + "\n");
            } else {
                fileWriter.write(line + "\n");
            }
        }

        fileReader.close();
        fileWriter.close();
    }
}
