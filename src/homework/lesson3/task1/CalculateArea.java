package homework.lesson3.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateArea {
    public static double calculateArea(float a, float b, float c){
        float p = (a+b+c)/2;
        return Math.sqrt((p*(p-a)*(p-b)*(p-c)));
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float a,b,c;
        System.out.println("Input a: ");
        a = Float.parseFloat(br.readLine());
        System.out.println("Input b: ");
        b = Float.parseFloat(br.readLine());
        System.out.println("Input c: ");
        c = Float.parseFloat(br.readLine());

        System.out.println("Area = " + calculateArea(a,b,c));

    }
}
