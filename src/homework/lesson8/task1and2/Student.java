package homework.lesson8.task1and2;

public class Student extends Person{
    private int course;

    public Student(String firstName, String lastName, int age, int course) {
        super(firstName, lastName, age);
        this.course = course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    @Override
    protected String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
