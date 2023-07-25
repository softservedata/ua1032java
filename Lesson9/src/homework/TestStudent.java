package homework;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("Roman Zozulia", "GroupA", 2, List.of(85, 90, 78, 92));
        Student student2 = new Student("Iryna Zozulia", "GroupB", 3, List.of(92, 88, 95, 89));
        Student student3 = new Student("Daria Shevchuk", "GroupA", 1, List.of(75, 65, 70, 70));
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        removingStudent(studentList);
        int courseNumber = 4;
        print(studentList,courseNumber);

    }

    public static void removingStudent(List<Student> students) {
        List<Student> niceStudent = new ArrayList<>();
        List<Student> badStudent =new ArrayList<>();
        for (Student student : students) {
            if (calculateAverage(student.getGrades()) >= 71){
                student.setCourse(student.getCourse()+1);
                niceStudent.add(student);
            }
            else{
                badStudent.add(student);
            }
        }
        System.out.println("Student who applied "+niceStudent);
        System.out.println("Student who dismissed "+badStudent);

    }

    public static double calculateAverage(List<Integer> grades) {
        var sum = 0;
        for (var grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
    public static void print(List<Student> students,int course){
        System.out.println("Students enrolled in Course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }


}
