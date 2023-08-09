package com.softserve.hw11.Task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        /*
        // Identify the longest word in the sentence and display it on the console.
        String [] arrOfStr = text.split(" ");
        String longestWord = " ";
        for(int i = 0; i < arrOfStr.length; i++){
            if(arrOfStr[i].length() >= longestWord.length()){
                longestWord = arrOfStr[i];
            }
        }
        System.out.println(longestWord);

        // Determine the number of letters in the longest word.
        System.out.println(longestWord.length());
        */

        /*
        // Display the second word of the sentence in reverse order on the console.
        String[] arrOfStr = text.split(" ");
        int index = -1;
        String secondElem = "";
        for(int i = 0; i < arrOfStr.length; i++){
            index++;
            if(index == 1){
                secondElem = arrOfStr[i];
            }
        }
        StringBuilder sb = new StringBuilder(secondElem);
        System.out.println(sb.reverse());
         */
    }
}
