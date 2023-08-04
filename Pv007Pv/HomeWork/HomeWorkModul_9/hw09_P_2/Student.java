package HomeWork.HomeWorkModul_9.hw09_P_2;
/**
 * 2. Create a class called Student which includes the following fields: name, group, course, and
 grades in different subjects. Create a collection that holds all objects. Write a methods that:
 o removes students with a grade point average of less than 3. If a student's average score is
 3 or higher, then they will be automatically promoted to the next course level.
 o printStudents(List<Student> students, int course) which takes a list of students and a
 course number as inputs. This method should print out the names of the students who
 are enrolled in the specified course number to the console.
 • In main() method create collection and output result.
 */
//the same about comments
import java.util.ArrayList;
import java.util.List;

//The Student class represents a student with their name, group, course, and average grade.
public class Student {
    private String name;                // Student's name
    private String group;               // Student's group
    private int course;                 // Student's course
    private double averageGrade;        // Student's average grade

    public Student(String name, String group, int course, double averageGrade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.averageGrade = averageGrade;
    }

    // Getters and Setters for the fields

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        // Create student objects
        Student student1 = new Student("Ivan", "MI-1", 1, 2);
        Student student2 = new Student("Petro", "MI-2", 2, 2);
        Student student3 = new Student("Misha", "MI-3", 3, 4.2);
        Student student4 = new Student("Lyda", "MI-1", 1, 3.9);

        // Add students to the list
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        // Print details of all students
        System.out.println("All Students:");
        for (Student student : studentList) {
            System.out.println("Name: " + student.getName()
                    + "; Group: " + student.getGroup()
                    + "; Course: " + student.getCourse()
                    + "; Average Grade: " + student.getAverageGrade() + ".");
            System.out.println();
        }

        // Print students of a specific course
        int courseNumber = 2;
        printStudents(studentList, courseNumber);

        // Update student positions (expel or promote)
        positionOfTheStudent(studentList);

        // Print details of students after position update
        System.out.println("Students transferred to the next course:");
        for (Student student : studentList) {
            System.out.println("Name: " + student.getName()
                    + "; Group: " + student.getGroup()
                    + "; Course: " + student.getCourse()
                    + "; Average Grade: " + student.getAverageGrade() + ".");
            System.out.println();
        }
    }

    //Updates the position (course) of each student based on their average grade.
    public static void positionOfTheStudent(List<Student> studentList) {
        List<Student> expelledStudents = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getAverageGrade() < 3) {
                expelledStudents.add(student);
            } else {
                int currentCourse = student.getCourse();
                student.setCourse(currentCourse + 1);
            }
        }
        studentList.removeAll(expelledStudents);

        System.out.println("Expelled Students: ");
        for (Student expelledStudent : expelledStudents) {
            System.out.println(expelledStudent.getName());
        }
        System.out.println();
    }

    //Prints the names of students in a specific course.
     public static void printStudents(List<Student> studentList, int course) {
        System.out.println("Students in Course " + course + ": ");
        for (Student student : studentList) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}




