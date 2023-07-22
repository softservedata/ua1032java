package homework.lesson9.task1;

import java.util.*;

public class MyCollection {

    public static void main(String[] args) {
        List<Integer> myCollection = MyFunctions.generateRandomList(10);
        System.out.println("The list is: " + myCollection + '\n');

        MyFunctions.swapMinMax(myCollection);
        System.out.println("The list is: " + myCollection + '\n');

        MyFunctions.randomThreeDigit(myCollection);
        System.out.println("The list is: " + myCollection + '\n');

        MyFunctions.insertZero(myCollection);
        System.out.println("The list is: " + myCollection + '\n');

        MyFunctions.copyK(myCollection, 3);
        System.out.println();

        MyFunctions.removeLastEven(myCollection);
        System.out.println("The list is: " + myCollection + '\n');

        MyFunctions.removeElementFollowingMinimum(myCollection);
        System.out.println("The list is: " + myCollection + '\n');

    }
}
