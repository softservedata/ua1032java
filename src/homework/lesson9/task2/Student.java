package homework.lesson9.task2;

public class Student {
    private String name;
    private String group;
    private int course;
    private int[] grades;
    private float averageGrade = 0;

    public Student(String name, String group, int course, int[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;

        for (int i = 0; i < grades.length; i++){
            averageGrade += grades[i];
        }
        averageGrade = averageGrade / grades.length;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return  name +
                ", group: " + group +
                ", avg grade: " + averageGrade;
    }
}
