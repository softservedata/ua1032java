package HomeWork01Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowerBed {
    public static void main ( String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input the radius: ");

        double radius = Double.parseDouble(br.readLine());

        // Розрахунок периметру клумби
        double perimeter = 2 * Math.PI * radius;

        //Для форматування значень 4 знаками після коми
        String formattedPerimeter = String.format("%.2f", perimeter);

        // Розрахунок площі клумби
        double area = Math.PI * Math.pow(radius, 2);
        String formattedArea = String.format("%.2f", area);

        System.out.println("Perimeter is: " + formattedPerimeter);
        System.out.println("Area is: " + formattedArea);

        BufferedReader close;

    }
}



