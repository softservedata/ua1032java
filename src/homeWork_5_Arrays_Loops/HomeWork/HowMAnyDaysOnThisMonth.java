package homeWork_5_Arrays_Loops.HomeWork;

import java.util.Scanner;

public class HowMAnyDaysOnThisMonth {

    private int [] arrayOgMonths2023 = {31,28,31,30,31,30,31,31,30,31,30,31};
    public void getMonthLength(){
        System.out.println("\n");
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a month number (1-12):");
        int numOfMonth = scanner.nextInt();
        System.out.println("in this month " +arrayOgMonths2023[numOfMonth-1] +" days");

    }
}
