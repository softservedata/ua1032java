package homework;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;


public class Homework {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //firstHomeWorkTask();
        //secondHomeWorkTask();
        //thirdHometask();
        fourthHomework();
    }

    public static void firstHomeWorkTask() {
        String text = "abc";
        int shift = 3;

        String encryptedText = encrypt(text, shift);
        System.out.println("Encryption is: " + encryptedText);

        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Decryption is: " + decryptedText);
    }

    public static String encrypt(String s, int n) {
        StringBuilder text = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                text.append((char) ((c - base + n) % 26 + base));

            } else {
                text.append(c);
            }

        }
        return text.toString();
    }

    public static String decrypt(String s, int n) {

        return encrypt(s, 26 - (n % 26));
    }

    public static void secondHomeWorkTask() {
        System.out.println("Input a date in format mm.dd.yy ");
        String date = scanner.nextLine();

        if (validDateFormat(date)) {
            System.out.println("Date is valid.");
        } else {
            System.out.println("Date is not valid.");
        }
    }

    public static boolean validDateFormat(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM.dd.yy");
        dateFormat.setLenient(false);
        try {
            Date parsedDate = dateFormat.parse(date);
            return date.equals(dateFormat.format(parsedDate));
        } catch (Exception e) {
            return false;
        }
    }


    public static void thirdHometask() {
        System.out.println("Input a year to check is it leap or not: ");
        int year = scanner.nextInt();
        var isTrue = Year.isLeap(year);
        if (isTrue) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static void fourthHomework(){
        LocalDate birthday =LocalDate.of(2003,11,30);

        DayOfWeek day =birthday.getDayOfWeek();
        System.out.println("My date of born "+ day.toString().toLowerCase());

        LocalDate plusSixMonths =birthday.plusMonths(6);
        DayOfWeek daySixMonths =plusSixMonths.getDayOfWeek();
        System.out.println("Day of the week after 6 months on "+daySixMonths.toString().toLowerCase()+" date: "+plusSixMonths);

        LocalDate plusTwelveMonths =birthday.plusMonths(12);
        DayOfWeek dayTwelveMonths =plusTwelveMonths.getDayOfWeek();
        System.out.println("Day of the week after 12 months on "+dayTwelveMonths.toString().toLowerCase()+" date: "+plusTwelveMonths);
    }

}