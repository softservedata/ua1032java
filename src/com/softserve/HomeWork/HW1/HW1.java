package com.softserve.HomeWork.HW1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HW1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //1. Flower bed is shaped like a circle. Calculate its perimeter and area. Input the radius from the console, and output obtained results.
        //2. Define two String variables name and address. Output question "What is your name? to the console. Read the value of name and output next question: "Where do you live, (name)?" to the console. Read the value of address from the console and output the complete information.
        //3. Three phone calls were made from different countries, each with a different cost per minute (c1, c2, and c3) and duration (t1, t2, and t3). Input all the source data from the console, calculate the cost of each call and the total cost, and output the results to the console.

        System.out.print("Task: ");
        int choice = Integer.parseInt(br.readLine());
        switch (choice){
            case 1:{
                System.out.print("Radius: ");
                //
                int radius = Integer.parseInt(br.readLine());
                double area = Math.PI *Math.pow(radius,2);
                double perimetr = 2*Math.PI*radius;
                int round = 100;
                //round the number to round
                area = Math.round(area*round);
                area /= round;
                perimetr = Math.round(perimetr*round);
                perimetr/=round;
                //print to the console
                System.out.println("Area: "+ area);
                System.out.println("Perimeter: "+ perimetr);

                break;
            }
            case 2:{
                System.out.println("What is your name?");

                String name = br.readLine();
                System.out.println("Where do you live, " +name+"?");

                String address = br.readLine();
                System.out.print("You are "+name+". You live "+address);
                break;
            }
            case 3:{
                double c1,c2,c3;    //cost per minute
                double t1,t2,t3;    //duration

                //Input data
                System.out.println("Cost per minute of the first call");
                c1 = Double.parseDouble(br.readLine());
                System.out.println("Duration of the first call");
                t1 = Double.parseDouble(br.readLine());

                System.out.println("Cost per minute of the second call");
                c2 = Double.parseDouble(br.readLine());
                System.out.println("Duration of the second call");
                t2 = Double.parseDouble(br.readLine());

                System.out.println("Cost per minute of the third call");
                c3 = Double.parseDouble(br.readLine());
                System.out.println("Duration of the third call");
                t3 = Double.parseDouble(br.readLine());

                //print results
                System.out.println("Price first call " + c1*t1);
                System.out.println("Price second call " + c2*t2);
                System.out.println("Price third call " + c3*t3);
                break;
            }
            default:{
                System.out.print("Such a task does not exist");
                break;
            }
        }
        br.close();
    }
}