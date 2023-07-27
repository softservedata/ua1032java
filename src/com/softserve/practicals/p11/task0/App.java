package com.softserve.practicals.p11.task0;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

class App {
//    public static void main(String[] args) {
//        String inputString = "This is simple that contains phone number +380505055050 That's great.";
//        String pattern = "(\\d+)";
//
//        Pattern pattern1 = Pattern.compile(pattern);
//        Matcher matcher = pattern1.matcher(inputString);
//
//        if(matcher.find()){
//            System.out.println("Phone number: " + matcher.group(0));
//        }else {
//            System.out.println("PHONE NUMBER NOT FOUND");
//        }
//    }


//        public static void main(String[] args) {
//
//            String regularExpression = "\\bjava\\b";
//
//            String inputString = "java java java2ee java";
//            Pattern pattern = Pattern.compile(regularExpression);
//            Matcher match = pattern.matcher(inputString);
//            int matchCounter = 0;
//
//            System.out.println("Now we will use method find()...");
//            while (match.find()){
//                matchCounter++;
//                System.out.println("start(): "  + match.start());
//                System.out.println("end(): " + match.end());
//                System.out.println("Number of match: " + matchCounter);
//            }
//        }


//    public static void main(String[] args) {
//        String regularExpression = "Java";
//        String inputString = "Java Developer";
//        Pattern pattern;
//        Matcher match;
//
//        pattern = Pattern.compile(regularExpression);
//        match = pattern.matcher(inputString);
//
//        System.out.println("Input string: " + inputString);
//        System.out.println("Regular expression: " + regularExpression);
//
//        System.out.println("\tUsing method lookingAt(): " + match.lookingAt());
//        System.out.println("\tMatches: " + match.matches());
//    }



//    public static void main(String[] args) {
//        String regularExpression = "C#";
//        String inputString = "C# is the most popular programming language in the world. You should learn C#.";
//        String realSituation = "Java";
//
//        Pattern pattern = Pattern.compile(regularExpression);
//        Matcher match = pattern.matcher(inputString);
//
//        System.out.println("Some people say:");
//        System.out.println(inputString);
//
//        inputString = match.replaceAll(realSituation);
//        System.out.println("But frankly speaking:");
//        System.out.println(inputString);
//    }



//    public static void main(String[] args) {
//        String regularExpression = "bla";
//        String inputString = "blablablaReallyblablablaImportantblablaInformationblabla";
//        String replace = " ";
//
//        System.out.println("Initial input string:");
//        System.out.println(inputString);
//
//        Pattern pattern = Pattern.compile(regularExpression);
//        Matcher match = pattern.matcher(inputString);
//        StringBuffer stringBuffer = new StringBuffer();
//
//        while (match.find()){
//            match.appendReplacement(stringBuffer, replace);
//        }
//        match.appendTail(stringBuffer);
//        System.out.println("Final input string:");
//        System.out.println(stringBuffer.toString());
//    }


}