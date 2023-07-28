package homework.lesson11.task1;

import java.util.Scanner;

public class FiveWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder[] words = new StringBuilder[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Type the word #" + (i + 1) + ": ");
            words[i] = new StringBuilder(sc.nextLine());
        }

        System.out.println("Second word reversed: " + words[1].reverse());

        int longestWordPos = 0;
        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > words[longestWordPos].length())
                longestWordPos = i;
        }
        System.out.println("Longest word: " + words[longestWordPos] +
                " and its length = " + words[longestWordPos].length());
    }
}
