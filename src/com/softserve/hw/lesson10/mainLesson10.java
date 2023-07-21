package com.softserve.hw.lesson10;

import com.softserve.hw.lesson10.task1.UnionAndIntersection;
import com.softserve.hw.lesson10.task2.ClassHelperMap;
import com.softserve.hw.lesson10.task3.Student;

import java.util.*;

public class mainLesson10 {
    public static void main(String[] args) {
/**---------------------Task1----------------------------------*/
        Set<Integer> setOne = new HashSet<>();
        setOne.add(1);
        setOne.add(2);
        setOne.add(3);
        setOne.add(4);
        setOne.add(5);
        Set<Integer> setTwo = new HashSet<>();
        setTwo.add(3);
        setTwo.add(4);
        setTwo.add(5);
        setTwo.add(6);
        setTwo.add(7);
        System.out.println(UnionAndIntersection.union(setOne, setTwo));
        System.out.println(UnionAndIntersection.intersect(setOne, setTwo));
/**---------------------Task2----------------------------------*/
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Last name1", "First name1");
        personMap.put("Last name11", "First name1");
        personMap.put("Last name2", "First name2");
        personMap.put("Last name3", "First name3");
        personMap.put("Last name4", "First name4");
        personMap.put("Last name5", "First name5");
        personMap.put("Last name6", "First name6");
        personMap.put("Last name7", "First name7");
        personMap.put("Last name8", "First name8");
        personMap.put("Last name9", "First name9");
        personMap.put("Last name10", "First name10");
        System.out.println(ClassHelperMap.nameMatchSearch(personMap));
        ClassHelperMap.delValue(personMap, "First name1");
        System.out.println(personMap);
        System.out.println(personMap.get("first name1"));
/**---------------------Task3----------------------------------*/
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Name1", 3));
        studentList.add(new Student("Name3", 3));
        studentList.add(new Student("Name2", 1));
        studentList.add(new Student("Name5", 5));
        studentList.add(new Student("Name4", 4));
        //print the names of the students from the list who are enrolled in the specified course
        Student.printStudent(studentList, 3);
        // the list of students sorted by name and sorted by course.
        System.out.println("No sort list\n" + studentList);
        studentList.sort(Student.studentComparatorByName());
        System.out.println("Sort be name\n" + studentList);
        studentList.sort(Student.studentComparatorByCourse());
        System.out.println("Sort by course\n" + studentList);
    }
}
