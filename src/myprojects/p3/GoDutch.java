package myprojects.p3;

import java.util.Scanner;

public class GoDutch {
    public static void main ( String[] args ) {

        Scanner sc = new Scanner(System.in);

        int totalBill = sc.nextInt();

        if (totalBill < 0) {
            System.out.println("Bill total amount cannot be negative");
            return;
        }

        int numberOfFriends = sc.nextInt();

        if (numberOfFriends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
            return;
        }

//        int paymentPerFriend;
//        if (numberOfFriends == 1) {
//            paymentPerFriend = 1;
//        }  else {
//            paymentPerFriend = (int) Math.ceil((totalBill * 1.1) / numberOfFriends);
//        }
//        System.out.println(paymentPerFriend);

        int paymentPerFriend = (int) Math.ceil((totalBill * 1.1) / numberOfFriends);

        System.out.println(paymentPerFriend);

        sc.close();
    }
}