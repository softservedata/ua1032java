package homeworkTaskOne;


public class Student extends Person implements Cloneable {

    private int courseId;

    public Student(FullName fullName, int age, int courseId) {
        super(fullName, age);
        this.courseId = courseId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public String info() {
        return "\nCourse Id is: " + courseId;
    }

    @Override
    public String activity() {
        return "I am doing homework to lecture 8! :)\n";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
