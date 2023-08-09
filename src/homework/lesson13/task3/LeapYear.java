package homework.lesson13.task3;

import java.time.Year;
import java.util.Scanner;

public class LeapYear {
    public static boolean leapYearCheck(int year) {
        return Year.isLeap(year);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input year : ");
        int input = sc.nextInt();
        System.out.println(input + " is leap?\n"
                + "Answer : " + leapYearCheck(input));
        sc.close();
    }
}
