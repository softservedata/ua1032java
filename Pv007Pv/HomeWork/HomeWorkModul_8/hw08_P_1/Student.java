package hw08_P_1;

/**
 1. Create a FullName class with the firstName and lastName fields of type String, which
 would correspond to the principle of encapsulation.
 • Create an abstract Person class with fullName field of type FullName and age of type int.
 • In the Person class, create:
 o a constructor public Person(FullName fullName, int age) ;
 o info() method, which will return a string in the format
 "First name: <firstName>, Last name: <lastName>, Age: <age>"
 o an abstract public activity() method with a String return type.
 2. Create a Student class with an int field that matches the course the student is taking.
 • In the Student class:
 o create a constructor with parameters to initialize all fields in the class;
 o override the info() method (which would also add course information to the
 previous line);
 o override the activity() method from the Person class. The activity() method should
 return a string value that is the type of activity for the corresponding Person subtype,
 for example for a student - this could be the value "I study at university".
 • In the main() method, create two instances of the Student class and output information
 about them by calling the appropriate methods info() and activity().
 • Create one more instance of Student class by cloning the first student, change a course
 for this object and output full information about created students.

 /**
 * The Student class represents a student, extending the Person class and implementing the Cloneable interface.
 * It adds the course field to store the course the student is taking.
 */
public class Student extends Person implements Cloneable {
    private int course; // Private field to store the course.

    //Constructs a Student object with the specified full name, age, and course.
    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    // Returns the course the student is taking.
    public int getCourse() {
        return course;
    }

    //Sets the course the student is taking.
    public void setCourse(int course) {
        this.course = course;
    }

    // Returns a string representation of the student's information, including the course.
    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    // Returns the activity of the student.
    @Override
    public String activity() {
        return "I study at university";
    }

    //Creates and returns a copy of the Student object.
    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning failed", e);
        }
    }

    //The main method creates instances of Student, demonstrates cloning, and outputs student information.
    public static void main(String[] args) {
        // Create two instances of the Student class
        Student student1 = new Student(new FullName("Taras", "Sheva"), 20, 31);
        Student student2 = new Student(new FullName("Andri", "Bob"), 21, 21);

        // Output information about Student 1.
        System.out.println("Information about Student 1:");
        System.out.println(student1.info());
        System.out.println(student1.activity());

        // Output information about Student 2.
        System.out.println("Information about Student 2:");
        System.out.println(student2.info());
        System.out.println(student2.activity());

        // Clone Student 1 and modify the course.
        Student student3 = student1.clone();
        student3.setCourse(4);

        // Output information about the cloned Student.
        System.out.println("Information about Cloned Student:");
        System.out.println(student3.info());
        System.out.println(student3.activity());

        // Output information about all students.
        System.out.println("Information about all Students:");
        System.out.println("Student 1:");
        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println("Student 2:");
        System.out.println(student2.info());
        System.out.println(student2.activity());

        System.out.println("Cloned Student:");
        System.out.println(student3.info());
        System.out.println(student3.activity());
    }
}
