package com.softserve.homework.hw04.task1;

public class Range {



    public static InRange checkRange(double n1, double n2, double n3){
        if((n1>=-5 && n1<=5) && (n2>=-5 && n2<=5) && (n3>=-5 && n3<=5)){
            return InRange.IN_RANGE;
        } else {
            return InRange.OUT_OF_RANGE;
        }
    }
}
