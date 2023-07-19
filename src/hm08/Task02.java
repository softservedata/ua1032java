package hm08;

class Task02 {
    public static class Student extends task01.Person {
        private int course;

        public Student(task01.FullName fullName, int age, int course) {
            super(fullName, age);
            this.course = course;
        }

        public int getCourse() {
            return course;
        }

        public void setCourse(int course) {
            this.course = course;
        }

        @Override
        public String info() {
            return super.info() + ", Course: " + course;
        }

        @Override
        public String activity() {
            return "I study at university";
        }
    }

    public static void main(String[] args) {
        // Create two instances of Student class
        task01.FullName student1FullName = new task01.FullName("John", "Doe");
        Student student1 = new Student(student1FullName, 20, 2);

        task01.FullName student2FullName = new task01.FullName("Jane", "Smith");
        Student student2 = new Student(student2FullName, 22, 3);

        // Output information about the first student
        System.out.println("Student 1 information:");
        System.out.println(student1.info());
        System.out.println(student1.activity());

        // Output information about the second student
        System.out.println("\nStudent 2 information:");
        System.out.println(student2.info());
        System.out.println(student2.activity());

        // Create a new student by cloning the first student and change the course
        Student clonedStudent = new Student(student1FullName, student1.getAge(), 4);
        System.out.println("\nCloned student information:");
        System.out.println(clonedStudent.info());
        System.out.println(clonedStudent.activity());
    }
}


