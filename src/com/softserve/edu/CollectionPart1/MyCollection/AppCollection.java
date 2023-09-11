package com.softserve.edu.CollectionPart1.MyCollection;

import java.util.*;

public class AppCollection {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list1;
        List<Integer> list2;
        ArrayList<Integer> myCollection = new ArrayList<>(Arrays.asList(-1,8 , 3, 2));

        LinkedList<Integer> myCollection1 = new LinkedList<>(myCollection);
        System.out.println(myCollection1);
        CollectionOperation op = new CollectionOperation();

        /*op.addRanElements(myCollection);*/
//        System.out.println(myCollection);

        /*System.out.println(myCollection);

        op.swapMaxMin(myCollection);

        System.out.println(myCollection);

        op.addDigitElementsAftNegative(myCollection);

        System.out.println(myCollection);

        op.insertZeroBetweenPosAndNeg(myCollection);

        System.out.println(myCollection);

        list1 = op.firstElements(myCollection, 5);

        System.out.println("List1: " + list1);

        list2 = op.lastElements(myCollection, 6);
        System.out.println("List2: " + list2);*/


        /*op.removeLastEvenElement(myCollection);*/
        op.removeElemAfterMin(myCollection1);
        System.out.println(myCollection1);



    }
}
