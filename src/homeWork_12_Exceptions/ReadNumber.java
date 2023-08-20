package homeWork_12_Exceptions;

import java.awt.image.ImagingOpException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadNumber {

    Scanner sc = new Scanner(System.in);

    public int readNumber(int start , int end) throws ArithmeticException {

        System.out.println("Input number fom "+start+ " to "+ end);

       Integer a = sc.nextInt();


       if(a<start || a>end ) {
           throw new ArithmeticException("Nunber is ot in the range " + start + " - " + end);
       }




        return a;
    }
}
