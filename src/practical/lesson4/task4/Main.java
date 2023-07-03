package practical.lesson4.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Product[] arr = new Product[4];
        arr[0] = new Product("Milk", 38.5, 2);
        arr[1] = new Product("Chips", 42.55, 10);
        arr[2] = new Product("Cookies", 24.99, 6);
        arr[3] = new Product("Water", 17.67, 50);

        //sorting by price (descending)
        Product temp;
        for (int i=0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++) {
                if(arr[i].getPrice()<arr[j].getPrice()){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        //output after the sort
        for (int i=0; i< arr.length; i++){
            arr[i].print();
        }

        System.out.println("\n\nThe most expensive item is: " + arr[0].getName() + " there are " + arr[0].getQuantity() + " items left");

        //sorting by quantity (descending)
        for (int i=0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++) {
                if(arr[i].getQuantity()<arr[j].getQuantity()){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("There are " + arr[0].getQuantity() + " " + arr[0].getName() + " items left (biggest quantity)");

    }
}

