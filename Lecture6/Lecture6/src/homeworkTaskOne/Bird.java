package homeworkTaskOne;

abstract class Bird {
    private String feathers;
    private String layEggs;

    public Bird(String feathers, String layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public String getFeathers() {
        return feathers;
    }

    public String getLayEggs() {
        return layEggs;
    }

    public abstract String getInfo();
}