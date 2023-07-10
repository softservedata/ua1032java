package com.softserve.HomeWork.HW5.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW5_task3 {
    public static Car[] sort(Car[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Car temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getYear() < temp.getYear()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    public static Car[] input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Size: ");
        int size = Integer.parseInt(br.readLine());
        Car[] arr = new Car[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Car();
            arr[i].input();
        }
        return arr;
    }

    public static void print(Car[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ". " + arr[i]);
        }
    }

    public static void main(String[] args) throws IOException {
//        Car[] arr = new Car[4];
//        arr[0] = new Car(TypeOfCar.SUV, 2002,8);
//        arr[1] = new Car(TypeOfCar.CONVERTIBLE, 2022,10);
//        arr[2] = new Car(TypeOfCar.MINIVAN, 2014,5.2);
//        arr[3] = new Car(TypeOfCar.ELECTRIC, 2023,5.2);
        Car[] arr = input();
        arr = sort(arr);
        print(arr);

    }
}
