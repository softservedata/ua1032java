package com.softserve.Practical.P4.task4_5;

import java.io.IOException;
import java.io.BufferedReader;

import java.io.InputStreamReader;

public class P4 {
    public static Product expensiveProduct(Product... items){
        Product max = items[0];
        for (Product item:items){
            if (item.getPrice() > max.getPrice()){
                max = item;
            }
        }
        return max;
    }
    public static Product biggestQuntity(Product... items){
        Product max = items[0];
        for (Product item:items){
            if (item.getQuantity() > max.getQuantity()){
                max = item;
            }
        }
        return max;
    }
    public static void main(String[] args)throws IOException {
        int size = 3;
        Product[] arr = new Product[size];
        for (int i = 0; i<size; i++){
            arr[i] = new Product();
            arr[i].input();
        }
        System.out.println("The most expensive item "+ expensiveProduct(arr));
        System.out.println("The biggest quantity "+biggestQuntity(arr));

    }
}
