package homeworkTaskOne;

/* Create a FullName class with the firstName and lastName fields of type String,
 which would correspond to the principle of encapsulation.
• Create an abstract Person class with fullName field of type FullName and age of type int.
•In the Person class, create:
constructor public Person(FullName fullName, int age) ;
info() method, which will return a string in the format
"First name: <firstName>, Last name: <lastName>, Age: <age>"
an abstract public activity() method with a String return type.
  Create a Student class with an int field that matches the course the student is taking.
• create a constructor with parameters to initialize all fields in the class;
• override the info() method (which would also add course information to the previous line);
• override the activity() method from the Person class.
The activity() method should return a string value that is the type of activity for the corresponding Person subtype,
 for example for a student - this could be the value "I study at university".
• In the main() method, create two instances of the Student class and output information about them
by calling the appropriate method info() and activity().

• Create one more instance of Student class by cloning the first student,
 change a course for this object and output full information about created students. */

public class TaskOneTest {
    public static void main(String[] args) {
        FullName full1 = new FullName("Iryna", "Vdovych");
        FullName full2 = new FullName("Roman", "Zozulia");
        Student st1 = new Student(full1, 18, 1);
        Student st2 = new Student(full2, 19, 2);
        System.out.print("~Student 1:");
        System.out.println(st1.info());
        System.out.println(st1.activity());
        System.out.print("~Student 2:");
        System.out.println(st2.info());
        System.out.println(st2.activity());
        try {
            Student st3 = (Student) st2.clone();
            st3.setCourseId(2);
            System.out.print("~A cloned student 2:");
            System.out.println(st3.info());
            System.out.println(st3.activity());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
