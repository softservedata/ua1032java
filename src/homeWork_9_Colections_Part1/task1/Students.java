package homeWork_9_Colections_Part1.task1;

public class Students {
    private String name;
    private String group;
    private int course;
    private double gradesInMath;
    private double gradesInHistory;
    private double gradesInBiology;

    public Students(String name, String group, int course, double gradesInMath, double gradesInHistory, double gradesInBiology) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.gradesInMath = gradesInMath;
        this.gradesInHistory = gradesInHistory;
        this.gradesInBiology = gradesInBiology;
    }

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

    public double getGradesInMath() {
        return gradesInMath;
    }

    public void setGradesInMath(double gradesInMath) {
        this.gradesInMath = gradesInMath;
    }

    public double getGradesInHistory() {
        return gradesInHistory;
    }

    public void setGradesInHistory(double gradesInHistory) {
        this.gradesInHistory = gradesInHistory;
    }

    public double getGradesInBiology() {
        return gradesInBiology;
    }

    public void setGradesInBiology(double gradesInBiology) {
        this.gradesInBiology = gradesInBiology;
    }
    public double getAverageGrade(){
        return (gradesInBiology+gradesInHistory+gradesInMath)/3;
    }




    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course='" + course + '\'' +
                ", gradesInMath=" + gradesInMath +
                ", gradesInHistory=" + gradesInHistory +
                ", gradesInBiology=" + gradesInBiology +
                "}\n";
    }
}
