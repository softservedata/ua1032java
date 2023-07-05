package com.softserve.practical;

public class testMain {
    public static int rentalCarCost(int d) {
        if (d >= 3 && d < 7) {
            return (d * 40) - 20;
        } else if (d < 3) {
            return d * 40;
        } else return (d * 40) - 40;
    }

    public static void main(String[] args) {
        System.out.println(rentalCarCost(7));
    }
}
