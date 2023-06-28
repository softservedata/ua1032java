package com.softserve.HomeWork.HW3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HW3 {
     public static int minElement(int[] array){
        int min = array[0];
        for(int i = 0; i<array.length; i++){
            if(min>array[i]){
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Task: ");
        int choice = Integer.parseInt(br.readLine());
        switch (choice){
            case 1:
                /*
                double a1,b1,c1;

                System.out.print("First side: ");
                a1 = Integer.parseInt(br.readLine());
                System.out.print("Second side: ");
                b1 = Integer.parseInt(br.readLine());
                System.out.print("Third side: ");
                c1 = Integer.parseInt(br.readLine());

                double p = a1 + b1 + c1;
                double s = Math.sqrt(p / 2 * (p / 2 - a1) * (p / 2 - b1) * (p / 2 - c1));
                */
                Triangle tri1 = new Triangle();
                Triangle tri2 = new Triangle(12,13,14);
                System.out.println(tri1);
                System.out.println(tri2);

                break;


            case 2:
                /*
                int a2,b2,c2;

                System.out.print("First number: ");
                a2 = Integer.parseInt(br.readLine());
                System.out.print("Second number: ");
                b2 = Integer.parseInt(br.readLine());
                System.out.print("Third number: ");
                c2 = Integer.parseInt(br.readLine());

                int min1 = a2;
                if (min1>b2){
                    min1 = b2;
                }
                if(min1>c2){
                    min1 = c2;
                }

                System.out.println("Minimal element: "+ min1);

                 */
                int[] array = {4,1,4,2,5,1,0,-2};
                int min2 = minElement(array);
                System.out.println("Minimal element: "+ min2);

                break;

            default:
                System.out.print("Such a task does not exist");
                break;


        }
    }

}
