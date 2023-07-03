package homework.lesson4.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException{
        float a;
        float b;
        float c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input a (first number): ");
        a = Float.parseFloat(br.readLine());
        System.out.print("Input b (second number): ");
        b = Float.parseFloat(br.readLine());
        System.out.print("Input c (third number): ");
        c = Float.parseFloat(br.readLine());

        //
        if (a<=5&&a>=-5){
            System.out.println("a = " + a + "(first number) belongs to the range [-5;5]");
        }
        else {
            System.out.println("a = " + a + "(first number) does NOT belong to the range [-5;5]");
        }
        //
        if (b<=5&&b>=-5){
            System.out.println("b = " + b + "(second number) belongs to the range [-5;5]");
        }
        else {
            System.out.println("b = " + b + "(second number) does NOT belong to the range [-5;5]");
        }
        //
        if (c<=5&&c>=-5){
            System.out.println("c = " + c + "(third number) belongs to the range [-5;5]");
        }
        else {
            System.out.println("c = " + c + "(third number) does NOT belong to the range [-5;5]");
        }

    }

}
