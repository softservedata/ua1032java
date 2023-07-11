package homeworkfirsttask;

abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    abstract void fly();

    public boolean isFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }
}
