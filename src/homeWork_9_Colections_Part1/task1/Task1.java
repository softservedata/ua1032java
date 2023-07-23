package homeWork_9_Colections_Part1.task1;

import java.util.*;


public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        List<Integer> myCollection = new ArrayList<Integer>();
        DoSomethinkWithList doSomethinkWithList = new DoSomethinkWithList(myCollection);
        doSomethinkWithList.addElements(r);
        doSomethinkWithList.swapMinMax();
        doSomethinkWithList.addRandomNumber(r);
        doSomethinkWithList.addZeroBetweenNumber();
        doSomethinkWithList.removeTheLastEvenElement();
        doSomethinkWithList.removeElementAfterMIN();
        System.out.println("\n Input k (number from 0 to "+doSomethinkWithList.getSize()+")");

        int k = sc.nextInt();
        System.out.println(doSomethinkWithList.getListBeforeK(k));

        System.out.println(doSomethinkWithList.getListAfterK(k));
    }
}
