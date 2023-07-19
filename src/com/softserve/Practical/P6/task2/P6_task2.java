package com.softserve.Practical.P6.task2;

import java.util.Arrays;
import java.util.Scanner;

public class P6_task2 {

    public static Car[] parking;
    public static boolean sortByMaxSpeed(Car a, Car b){
        return a.getMaxSpeed() > b.getMaxSpeed();
    }
    public static boolean sortByYear(Car a, Car b){
        return a.getYearOfProduction() > b.getYearOfProduction();
    }
    public static void sort() {
        for (int i = 1; i < parking.length; i++) {
            Car temp = parking[i];
            int j = i - 1;
            while (j >= 0 && sortByMaxSpeed(parking[i], temp)) {
                parking[j + 1] = parking[j];
                j = j - 1;
            }
            parking[j + 1] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size: ");
        int size = scanner.nextInt();
        parking = new Car[size];

        for (int i = 0; i < parking.length;i++){
            System.out.println("What car? Sedan or Track");
            switch (scanner.nextLine().toLowerCase()){
                case "track" -> parking[i] = new Truck();
                default -> parking[i] = new Sedan();
            }
            parking[i].input();
            System.out.println("-----------------------");
        }
        sort();
        System.out.println(Arrays.toString(parking));

    }
}
