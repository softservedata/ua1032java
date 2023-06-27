package hm03;

import java.util.Scanner;

public class task01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the width of the triangle:" );
        float width = scanner.nextFloat();
        System.out.print("enter the height of the triangle:" );
        float height = scanner.nextFloat();
        float area = (width* height) /2;
        System.out.print("the area of the triangle is equal to:" +area);

    }
}
