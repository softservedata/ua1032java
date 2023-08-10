package hw16_P_1;

import java.io.*;
import java.util.ArrayList;

/**
 * 1. Create file1.txt file with a text about your career.
 * Read context from file into array of strings. Each array item contains one line from file.
 * Write in to the file2.txt
 * 1) number of lines in file1.txt.
 * 2) the longest line in file1.txt.
 * 3) your name and birthday date.
 */

public class App1 {
    public static void main(String[] args) {
        // Get the file path of file1.txt using the class's resource
        String inputFilePath = App1.class.getResource("file1.txt").getFile();

        // Create a File object for the input file
        File inputFile = new File(inputFilePath);

        // Get the parent directory of the input file
        String inputDirectory = inputFile.getParent();

        // Create the output file path using the input directory and file name
        String outputFilePath = new File(inputDirectory, "file2.txt").getPath();

        try {
            // Create an ArrayList to store lines read from the input file
            ArrayList<String> lines = new ArrayList<>();

            // Open a BufferedReader to read from the input file
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            String line;

            // Read each line from the input file and add it to the ArrayList
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();

            // Extract the name and birthdate from the lines using helper methods
            String name = extractName(lines);
            String birthdate = extractBirthdate(lines);

            // Open a BufferedWriter to write to the output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

            // Write the number of lines in the input file to the output file
            writer.write("Number of lines in the file file1.txt: " + lines.size());
            writer.newLine();

            // Find the longest line in the input file and write it to the output file
            String longestLine = findLongestLine(lines);
            writer.write("Longest line in the file file1.txt: " + longestLine);
            writer.newLine();

            // Write the extracted name to the output file
            writer.write("Your name: " + name);
            writer.newLine();

            // Write the extracted birthdate to the output file
            writer.write("Birthdate: " + birthdate);
            writer.newLine();

            // Close the writer to save the changes to the output file
            writer.close();

            // Print a success message to the console
            System.out.println("Task successfully completed!");
        } catch (IOException e) {
            // Print an error message and the exception details if an error occurs
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Helper method to find the longest line in the ArrayList of lines
    private static String findLongestLine(ArrayList<String> lines) {
        String longestLine = "";
        for (String line : lines) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }
        return longestLine;
    }

    // Helper method to extract the name from the ArrayList of lines
    private static String extractName(ArrayList<String> lines) {
        for (String line : lines) {
            if (line.startsWith("My name:")) {
                // Extract the name after the "My name:" prefix and trim any whitespace
                return line.substring("My name:".length()).trim();
            }
        }
        return "[Name not found]";
    }

    // Helper method to extract the birthdate from the ArrayList of lines
    private static String extractBirthdate(ArrayList<String> lines) {
        for (String line : lines) {
            if (line.startsWith("Birthdate:")) {
                // Extract the birthdate after the "Birthdate:" prefix and trim any whitespace
                return line.substring("Birthdate:".length()).trim();
            }
        }
        return "[Birthdate not found]";
    }
}
