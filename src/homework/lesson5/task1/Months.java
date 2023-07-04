package homework.lesson5.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Months {
    public static void main(String[] args) throws IOException{
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input the name of the month: ");
        String chosenMonth = br.readLine().toLowerCase();
        System.out.print("Days in " + chosenMonth + " - ");
        switch(chosenMonth){
            case "january":
                System.out.println(daysInMonth[0]);
                break;
            case "february":
                System.out.println(daysInMonth[1]);
                break;
            case "march":
                System.out.println(daysInMonth[2]);
                break;
            case "april":
                System.out.println(daysInMonth[3]);
                break;
            case "may":
                System.out.println(daysInMonth[4]);
                break;
            case "june":
                System.out.println(daysInMonth[5]);
                break;
            case "july":
                System.out.println(daysInMonth[6]);
                break;
            case "august":
                System.out.println(daysInMonth[7]);
                break;
            case "september":
                System.out.println(daysInMonth[8]);
                break;
            case "october":
                System.out.println(daysInMonth[9]);
                break;
            case "november":
                System.out.println(daysInMonth[10]);
                break;
            case "december":
                System.out.println(daysInMonth[11]);
                break;
            default:
                System.out.println("Error : no such month");

        }
    }
}
