package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeworkTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // firstHomeTask(scanner);
       // secondHomeTask(scanner);
        thirdHometask(scanner);
    }




    private static void firstHomeTask(Scanner scanner) {
        System.out.println("Enter a sentence of five words:");
        String sentence = scanner.nextLine();
        List<String> words = List.of(sentence.split("\\s+"));

        if (words.size() == 5) {
            System.out.println("The sentence is valid");
        } else {
            System.out.println("The sentence isn't valid");
        }

        String longestWord = words.get(0);
        for (int i = 1; i < words.size(); i++) {
            String word = words.get(i);
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("The longest word is: " + longestWord);


        List<Character> lettersList = new ArrayList<>();

        for (int i = 0; i < longestWord.length(); i++) {
            char letter = longestWord.charAt(i);
            lettersList.add(letter);
        }
        System.out.println("The number of letters in the longest word is: " + lettersList.size());


        StringBuilder wordsRevered = new StringBuilder(words.get(1)).reverse();
        System.out.println("the second word of the sentence in reverse order is: " + wordsRevered);
    }


    private static void secondHomeTask(Scanner scanner) {
        System.out.println("Input a sentence that contains words separated by more than:");
        String sentence = scanner.nextLine();
        System.out.println("Sentence Original: " + sentence);
        String sentence1= sentence.replace("  ", " ");
        System.out.println("Sentence: " + sentence1);
    }

    private static void thirdHometask(Scanner scanner) {


    }



}
