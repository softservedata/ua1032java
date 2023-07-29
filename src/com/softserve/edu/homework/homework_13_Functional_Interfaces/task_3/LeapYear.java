package com.softserve.edu.homework.homework_13_Functional_Interfaces.task_3;

import java.time.Year;

public class LeapYear {
    public static boolean leap_year(int year){
       return Year.isLeap(year);
    }
}
