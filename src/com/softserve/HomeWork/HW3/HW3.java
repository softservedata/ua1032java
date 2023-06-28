package com.softserve.HomeWork.HW3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HW3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Task: ");
        int choice = Integer.parseInt(br.readLine());
        switch (choice){
            case 1:{
                Triangle tri1 = new Triangle();
                Triangle tri2 = new Triangle(12,13,14);
                System.out.println(tri1);
                System.out.println(tri2);
                break;
            }
            default:{
                System.out.print("Such a task does not exist");
                break;

            }
        }
    }

}
