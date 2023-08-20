package homeWork_12_Exceptions;

import com.sun.jdi.request.StepRequest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        ReadNumber rn = new ReadNumber();

        List<Integer> listOfInt = new ArrayList<>();

        while(listOfInt.size()<10){

            try{
            listOfInt.add(rn.readNumber(1,100));
            } catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }

        }


        Collections.sort(listOfInt);

        for (Integer a:
             listOfInt) {
            System.out.println(a);

        }


    }
}
