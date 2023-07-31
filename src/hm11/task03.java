package hm11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task03 {

    public static class USCurrencyFormat {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the text containing US currency formats: ");
            String text = scanner.nextLine();

            String usCurrencyPattern = "\\$\\d+(\\.\\d{2})?";
            Pattern pattern = Pattern.compile(usCurrencyPattern);
            Matcher matcher = pattern.matcher(text);

            System.out.println("Found US currency formats:");
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
            scanner.close();
        }
    }

}
