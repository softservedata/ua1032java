package firsthomework;

public class TestTask {
    public static void main(String[] args) {
        FullName fullName1 = new FullName("Iryna", "Zozulia");
        FullName fullName2 = new FullName("Roman", "Zozulia");
        Student student1 = new Student(fullName1, 18, 1);
        Student student2 = new Student(fullName2, 19, 2);

        System.out.println("Student 1: \n" + student1.info()+"\n" + student1.activity());
        System.out.println("Student 2:\n" + student2.info()+"\n"+student2.activity());

        try {
            Student student3 =(Student) student2.clone();
            student3.setCourseId(3);
            System.out.println("Student 3:\n" + student3.info()+"\n"+student3.activity());
            System.out.println("I'm cloned");

        } catch (CloneNotSupportedException exception) {
            throw new RuntimeException(exception);
        }
    }

}
