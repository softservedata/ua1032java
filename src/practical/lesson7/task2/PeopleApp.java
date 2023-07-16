package practical.lesson7.task2;

public class PeopleApp {
    public static void main(String[] args) {
        Person [] people = {new Student("Petro"),
                            new Teacher("Vasyl", 500),
                            new Cleaner("Severyn", 300)};

        for (int i = 0; i < people.length; i++){
            System.out.println(people[i].getName() + ':');
            people[i].print();
            if (people[i] instanceof Teacher || people[i] instanceof Cleaner) {
                ((Staff) people[i]).salary();
            }
        }
    }
}
