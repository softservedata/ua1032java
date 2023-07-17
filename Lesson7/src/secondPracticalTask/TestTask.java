package secondPracticalTask;

public class TestTask {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Teacher("Roman");
        persons[1] = new Cleaner("Iryna");
        persons[2] = new Student("Daria");
        persons[3] = new Teacher("Olga");
        persons[4] = new Cleaner("Yulia");

        for (Person person : persons) {
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
        }
    }
}

