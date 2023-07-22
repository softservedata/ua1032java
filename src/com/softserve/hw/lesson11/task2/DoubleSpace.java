package com.softserve.hw.lesson11.task2;

import java.util.Arrays;

public class DoubleSpace {
    public static String reverseOneSpace(String sentence) {
        String[] split = sentence.split("\\s+");
        StringBuffer sb = new StringBuffer();
        String result = null;
        for (int i = 0; i < split.length; i++) {
            result = String.valueOf(sb
                    .append(split[i])
                    .append(" "));
        }

        return result;
    }
}
