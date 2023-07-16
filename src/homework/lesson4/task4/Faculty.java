package homework.lesson4.task4;

public class Faculty {
    private final int studentsNumber;
    private final Profession profession;

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
