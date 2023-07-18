package practice4;


import java.util.Scanner;

public class task_2 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the day of the week (1-7) :");
        int day = scan.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday Понеділок");
                break;
            case 2:
                System.out.println("Tuesday Вівторок");
                break;
            case 3:
                System.out.println("Wednesday Середа");
                break;
            case 4:
                System.out.println("Thursday Четверг");
                break;
            case 5:
                System.out.println("Friday Пятниця");
                break;
            case 6:
                System.out.println("Saturday Субота");
                break;
            case 7:
                System.out.println("Sunday Неділя");
                break;
            default:
                System.out.println("Unknown");


    }


    }
}
