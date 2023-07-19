package com.softserve.edu.hw4;
import java.util.Scanner;
enum HTTPError {
    ERROR400(400, "bad request"),
    ERROR401(401, "authorization required") ,
    ERROR402(402, "payment required"),
    ERROR403(403, "forbidden area"),
    ERROR404(404, "not found");

    private int num;
    private String name;
    private HTTPError(int num, String name) {
        this.num = num;
        this.name = name;
    }



    public void FindError(int num1) {
        for (HTTPError error: values()) {
            if(error.num == num1) {
                System.out.println(error.name);
            }
        }
    }

}
public class Homework09 {

    public static void main(String[] args) {
        int num1;

        Scanner scan = new Scanner(System.in);

        HTTPError error = HTTPError.ERROR400;

        num1 = scan.nextInt();

        error.FindError(num1);
        scan.close();
    }

}
