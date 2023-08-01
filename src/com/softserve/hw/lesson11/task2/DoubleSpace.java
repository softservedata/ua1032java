package com.softserve.hw.lesson11.task2;

import java.util.Arrays;

public class DoubleSpace {
    public static String reverseOneSpace(String sentence) {
        String[] split = sentence.split("\\s+");
        StringBuilder sb = new StringBuilder();//StringBuilder is more quickly than StringBuffer, but it is not thread-safe
        //but in this case we don't need thread-safe
        String result = null;
        for (int i = 0; i < split.length; i++) {
            result = String.valueOf(sb
                    .append(split[i])
                    .append(" "));
        }

        return result;
    }
}
