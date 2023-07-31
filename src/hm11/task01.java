package hm11;

import java.util.Scanner;

public class task01 {
    public static class SentenceAnalyzer{
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("enter a sentence:");
            String sentence = scanner.nextLine();

            String[] words = sentence.split(" ");

            String LongestWord = "";
            for (String word : words){
                if (word.length()> LongestWord.length()){
                    LongestWord= word;
                }
            }
            System.out.println("longest word:"+ LongestWord);
            System.out.println("the numbers of letters in the longest word:" + LongestWord.length());


            if (words.length >=2) {
                String secondWord = words[1];
                StringBuilder reversedSecondWord = new StringBuilder(secondWord).reverse();
                System.out.println("second word in the reserve order:" + reversedSecondWord);
            }else{
                System.out.println("less than two words in a sentence:");
            }
            scanner.close();
        }
    }
}
