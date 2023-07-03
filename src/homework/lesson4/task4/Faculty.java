package homework.lesson4.task4;

public class Faculty {
    private int studentsNumber;
    private Profession profession;

    public Faculty(int studentsNumber, Profession profession) {
        this.studentsNumber = studentsNumber;
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "studentsNumber=" + studentsNumber +
                ", profession=" + profession +
                '}';
    }
}
