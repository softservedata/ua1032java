package com.softserve.edu.homework.testng;

import java.io.ByteArrayInputStream;
import java.time.LocalDate;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.stream.Stream;


public class Example  {
    public static void main(String[] args) {
        String obj = "abc";
        byte b[] = obj.getBytes();
        ByteArrayInputStream obj1 = new ByteArrayInputStream(b);
        for (int i = 0; i < 2; ++ i) {
            int c;
            while ((c = obj1.read()) != -1) {
                if (i == 0) {
                    System.out.print((char)c);
                }
            }
        }
    }
}
