package homework.lesson8.task1and2;

public abstract class Person implements Cloneable{
    protected FullName fullName;
    protected int age;

    public Person(String firstName, String lastName, int age) {
        this.fullName = new FullName(firstName, lastName);
        this.age = age;
    }
    protected String info(){
        return "First name: " + fullName.getFirstName() +
                ", Last name: " + fullName.getLastName() +
                " , Age: " + age;
    }
    public abstract String activity();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clone = (Person) super.clone();
        return clone;
    }
}
