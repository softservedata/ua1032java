package hw16_P_2;

/**
 * 2. A file with java code is given. Read program text from file and all words public in the
 * declaration of class attributes and methods should be replaced with the word private.
 * Save the result to another previously created file.
 */

import java.io.*;

public class App2 {
    public static void main(String[] args) {
        // Define the input file path
        String inputFilePath = "E:\\JAVA\\JavaFundamentals23_From_Soft_Serve\\For_Idea\\src\\hw16_P_2\\Code_Input.txt";

        // Define the output file path
        String outputFilePath = "E:\\JAVA\\JavaFundamentals23_From_Soft_Serve\\For_Idea\\src\\hw16_P_2\\Code_Output.txt";

        try {
            // Read text from the input file
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));

            // Create a StringBuilder to hold the content
            StringBuilder content = new StringBuilder();
            String line;

            // Read each line from the input file and append to the content
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }

            // Close the reader
            reader.close();

            // Replace occurrences of "public" with "private"
            String modifiedContent = content.toString().replaceAll("\\bpublic\\b", "private");

            // Write the updated content back to the output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            writer.write(modifiedContent);

            // Close the writer
            writer.close();

            // Print a success message
            System.out.println("Replacement completed successfully!");
        } catch (IOException e) {
            // Print an error message along with the exception details
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
