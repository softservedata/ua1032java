package com.softserve.practical.practicalHW_5;

import com.softserve.practical.practicalHW_5.task1.TaskOneArray;
import com.softserve.practical.practicalHW_5.task3.ArrayTenNumbers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class mainPractical_5 {
    public static void main(String[] args) {
/**---------------------------Task1---------------------------*/
//        TaskOneArray.stringArraySort();
//        int[] arr = TaskOneArray.intArrayAVG();
//        System.out.println(TaskOneArray.methodCheck(arr));
/**---------------------------Task3---------------------------*/
        int[] arr2 = ArrayTenNumbers.createArrayInt();
//        System.out.println("Min value = " + ArrayTenNumbers.seekMaxValueArray(arr2));
//        System.out.println("Sum positive number= " + ArrayTenNumbers.sumPositiveNumber(arr2));
        System.out.println(ArrayTenNumbers.identifyMorePositiveOrNegative(arr2));

    }
}
