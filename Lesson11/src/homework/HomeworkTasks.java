package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeworkTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nChoose action:");
            System.out.println("\t1 - Check first  Home task ");
            System.out.println("\t2 - Check second Home  task");
            System.out.println("\t3 - Check third Home  task");
            System.out.println("\t4 - Check fourth Home  task");
            System.out.println("\t5 - End work ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> firstHomeTask(scanner);
                case 2 -> secondHomeTask(scanner);
                case 3 -> thirdHometask(scanner);
                case 4 -> fourthHometask(scanner, random);
                case 5 -> {
                    sc.close();
                    scanner.close();

                    return;
                }
                default -> System.out.println("Necessary to enter option 1-4\n");
            }
        }

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
        System.out.println("Enter text containing US currency format:");
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("(\\$)[\\d]+|[.,](\\d{2})");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Occurrences of US currency format:");
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));

        }
    }

    private static void fourthHometask(Scanner scanner, Random random) {
        String firstName = validName("Enter first name", scanner);
        String lastName = validName("Enter second name", scanner);

        String[] greetingMessage = {"Hello, %s! Nice to meet you.",
                "Hey there, %s! Welcome.",
                "Hi, %s! How are you? ",
                "Hi %s! Where are you from"};


        var index = random.nextInt(greetingMessage.length);
        System.out.printf(greetingMessage[index], firstName +" "+ lastName);

    }

    private static String validName(String s1, Scanner scanner) {
        Pattern pattern = Pattern.compile("[A-Za-z -]");
        while (true) {
            System.out.println(s1);
            String str = scanner.nextLine();
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return str;
            } else {
                System.out.println("Invalid input. Please use only English letters, spaces, and hyphens.");
            }
        }
    }


}
