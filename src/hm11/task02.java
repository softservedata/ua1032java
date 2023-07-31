package hm11;

import java.util.Scanner;

public class task02 {
    public static class RemoveExtraSpaces{
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);

            System.out.print("enter sentence:");
            String sentence = scanner.nextLine();

            String modifiedSentence = sentence.replaceAll("\\s+", " ");

            System.out.println("modify sentence:"+ modifiedSentence);

            scanner.close();
        }
    }
}
