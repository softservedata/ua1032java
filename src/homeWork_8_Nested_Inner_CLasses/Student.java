package homeWork_8_Nested_Inner_CLasses;

public class Student  extends Person implements Cloneable {
    private int courseTaking;

    public Student(String firstName, String lastName, int age, int courseTaking) {
        super(firstName, lastName, age);
        this.courseTaking=courseTaking;
    }



    @Override
    public String info() {
        return "Person{" +
                "firstName=" + fullName.getFirstName() +
                ", lastName=" + fullName.getLastName() +
                ", age=" + age +
                ", courseTaking=" + courseTaking +
                '}';
    }

    public int getCourseTaking() {
        return courseTaking;
    }

    public void setCourseTaking(int courseTaking) {
        this.courseTaking = courseTaking;
    }

    @Override
    public String activiti() {
        return "I study at university";
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
