package HomeWork.HomeWorkModul_10.hw10_P_3;

/**
 3. Create a class named Student that stores information about the student's name and
 course.
 • The class should include properties to access these fields, a constructor with
 parameters, and a method called printStudents that takes a List of students and an
 Integer representing the course number as arguments.
 • This method should print the names of the students from the list who are enrolled in
 the specified course to the console using an iterator.
 • Additionally, add methods to compare students by name and by course.
 • In the main() method, create a List named "students" and add five different Student
 objects to it. Then, display the list of students sorted by name and sorted by course.

 3. Створіть клас під назвою Student, який зберігає інформацію про ім’я студента та
 курс.
 • Клас повинен містити властивості для доступу до цих полів, конструктор з
 параметри та метод під назвою printStudents, який приймає список студентів і
 Ціле число, що представляє номер курсу як аргументи.
 • Цей метод повинен друкувати імена студентів зі списку, які зараховані
 вказаний курс на консоль за допомогою ітератора.
 • Крім того, додайте методи для порівняння студентів за іменами та курсами.
 • У методі main() створіть список із назвою «студенти» та додайте п’ять різних студентів
 заперечує проти цього. Потім відобразіть список студентів, відсортований за іменами та курсами.
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public static void printStudents(List<Student> students, int courseNumber) {
        System.out.println("Students enrolled in course " + courseNumber + ":");
        for (Student student : students) {
            if (student.getCourse() == courseNumber) {
                System.out.println("Name: " + student.getName() + ", Course: " + student.getCourse());
            }
        }
    }

    // Method to compare students by name
    public static Comparator<Student> compareByName() {
        return Comparator.comparing(Student::getName);
    }

    // Method to compare students by course
    public static Comparator<Student> compareByCourse() {
        return Comparator.comparingInt(Student::getCourse);
    }

    // Method to check for students with duplicate names
    public static boolean hasDuplicateNames(List<Student> students) {
        students.sort(compareByName());
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getName().equals(students.get(i - 1).getName())) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Create a list to store student objects
        List<Student> students = new ArrayList<>();

        // Add five different Student objects to the list
        students.add(new Student("Ivan", 1));
        students.add(new Student("Petro", 2));
        students.add(new Student("Maria", 1));
        students.add(new Student("Oleg", 3));
        students.add(new Student("Oleg", 2));

        // Display the list of students sorted by name
        students.sort(compareByName());
        System.out.println("Students sorted by name:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Course: " + student.getCourse());
        }

        // Display the list of students sorted by course
        students.sort(compareByCourse());
        System.out.println("\nStudents sorted by course:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Course: " + student.getCourse());
        }

        // Check for students with duplicate names
        if (hasDuplicateNames(students)) {
            System.out.println("\nThere are students with the same names.");
        } else {
            System.out.println("\nThere are no students with the same names.");
        }
    }
}

