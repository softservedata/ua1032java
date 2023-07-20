package firsthomework;

public abstract class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info() {
        return "First name: <firstName>, Last name: <lastName>, Age: <age>";
    }
    abstract public String activity();


}
