package homework.lesson11.task2;

import java.util.Scanner;
import java.util.regex.*;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a sentence: ");

        String sentence = sc.nextLine();
        String pattern = "\\S+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(sentence);

        System.out.print("Your sentence without multiple spaces: ");
        while (m.find()) {
            System.out.print(sentence.substring(m.start(), m.end()) + " ");
        }
    }
}
