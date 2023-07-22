package com.softserve.edu.homework.homework_10_Collections.task_3;

import java.util.*;
import java.lang.String;
import java.util.Scanner;

public class Student {
    private String name;
    private int course;
 public Student(Map<String,Object> students){
    if (students == null) {
         throw new IllegalArgumentException("Map 'students' cannot be null.");
     }
     if (students.containsKey("name")) {
         this.name = (String) students.get("name");
     } else {
         throw new IllegalArgumentException("Key 'name' is missing in the data.");
     }
     if (students.containsKey("course")) {
         this.course = (Integer) students.get("course");
     } else {
         throw new IllegalArgumentException("Key 'course' is missing in the data.");
     }
 }

 public String getName(){
  return name;
 }
    public static Map<String, Object> createStudentData(String name, int course) {
        Map<String, Object> studentData = new HashMap<>();
        studentData.put("name", name);
        studentData.put("course", course);
        return studentData;
    }
 public static void printStudents(Map<String, Object>[] students){
     int j = 0;
     for(Map<String, Object> data : students){
         String name = (String) data.get("name");
         int course = (Integer) data.get("course");
         j++;
         System.out.println("Student  " + j + " : "+ name + ", who studies in the "+ course +"th year");
     }
 }
 public static void students_course(Map<String,Object>[] students){
     Scanner in = new Scanner(System.in);
     System.out.print("\nEnter course : ");
     int input = Integer.parseInt(in.nextLine());
     System.out.print("list of students in the " + input + "nd year : ");
     for(Map<String, Object> data : students){
         String name = (String) data.get("name");
         int course = (Integer) data.get("course");
         if(course == input){
             System.out.print(name + "; ");
         }
     }
 }
 public static void comparing_elements_by_name(Map<String,Object>[] students){
     System.out.println("\n\n\t↓ Comparing elements by name ↓");
     Arrays.sort(students, (s1, s2) -> ((String) s1.get("name")).compareTo((String) s2.get("name")));
     printStudents(students);
 }
    public static void comparing_elements_by_course(Map<String,Object>[] students){
        System.out.println("\n\t↓ Comparing elements by course ↓");
        Arrays.sort(students, (s1, s2) -> ((Integer) s1.get("course")).compareTo((Integer) s2.get("course")));
        printStudents(students);
    }
}

