package homework.lesson6.task1;

public abstract class Bird {
    protected boolean feathers;
    protected int layEggs;

    protected abstract void fly();

    public Bird(boolean feathers, int layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
    @Override
    public String toString() {
        return "feathers : " + feathers +
                ", lays eggs: " + layEggs;
    }
}
