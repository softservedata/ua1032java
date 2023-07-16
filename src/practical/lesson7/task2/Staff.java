package practical.lesson7.task2;

public abstract class Staff extends Person{
    protected float salary;
    public Staff(String name, float salary) {
        super(name);
        this.salary = salary;
    }

    public abstract void salary();

    @Override
    public void print() {
        System.out.print("I am a ");
    }
}
