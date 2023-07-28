package homework.lesson11.task3;

import java.util.Scanner;
import java.util.regex.*;

public class DollarTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "(\\$)[\\d]+|[.,](\\d{2})";
        System.out.print("Input the line with US currency: ");
        String currency = sc.nextLine();

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(currency);
        System.out.println("Found: ");
        while (m.find())
            System.out.print(currency.substring(m.start(), m.end()));
    }
}
