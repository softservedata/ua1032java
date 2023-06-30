package HomeWork1;

import java.util.Scanner;

public class Third_Task {
    public  static void third_task(){
    Scanner sc = new Scanner(System.in);
    System.out.println("input first price");
    int c1=sc.nextInt();
        System.out.println("input second price");
    int c2 = sc.nextInt();
        System.out.println("input third price");
    int c3 = sc.nextInt();
        System.out.println("input first time");
    int t1=sc.nextInt();
        System.out.println("input second time");
    int t2 = sc.nextInt();
        System.out.println("input third time");
    int t3 = sc.nextInt();
    int cost1 = c1*t1;
    int cost2 =c2*t2;
    int cost3 = c3*t3;
        System.out.println("Price for first call: "+cost1);
        System.out.println("Price for first call: "+cost2);
        System.out.println("Price for first call: "+cost3);
    int totalCost= cost1+cost2+cost3 ;
        System.out.println("Total Price for all calls: "+totalCost);
}
}
