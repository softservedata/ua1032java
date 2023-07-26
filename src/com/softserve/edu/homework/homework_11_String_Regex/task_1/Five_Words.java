package com.softserve.edu.homework.homework_11_String_Regex.task_1;
public class Five_Words {
    public static String the_longest_word(String line){
        System.out.print("The longest word in the sentence : ");
        String[] words = line.split(" ");
        String longestWord = "";

        for(String word : words){
            if(words.length > longestWord.length()){
                longestWord = word;
            }
        }
    return longestWord;
    }
    public static int  longest_word(String line){
        System.out.print("The number of letters in the longest word : ");
        String[] words = line.split(" ");
        String longestWord = "";

        for(String word : words){
            if(words.length > longestWord.length()){
                longestWord = word;
            }
        }
        return longestWord.length();
    }
    public static String reverse_word(String line){
        System.out.print("The reverse second word in the sentence : ");
        String[] words = line.split(" ");
        if(words.length > 1){
            String secondWord = words[1];
            StringBuilder reversedSecondWord = new StringBuilder();
            for (int i = secondWord.length() - 1; i >= 0; i--) {
                reversedSecondWord.append(secondWord.charAt(i));
            }
            System.out.println(reversedSecondWord);
        }
        else {System.out.println("There are not enough words");
        }
    return "";
    }
}
