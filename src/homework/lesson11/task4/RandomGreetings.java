package homework.lesson11.task4;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RandomGreetings {
    public static void randomGreeting(String name) {
        String[] greetingsArr = {"Hi", "Hello", "Hey", "Greetings", "Howdy", "Yo", "What's up"};
        Random random = new Random();

        System.out.println(greetingsArr[random.nextInt(7)] + ", " + name);
    }

    public static String nameInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input Your name (in English) : ");

        String name = sc.nextLine();
        String pattern = "[A-Za-z]+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(name);

        if (!m.find()) {
            System.out.println("You made a mistake, try again please");
            return nameInput();
        } else
            return name;
    }

    public static void main(String[] args) {
        randomGreeting(nameInput());
    }
}
