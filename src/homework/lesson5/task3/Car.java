package homework.lesson5.task3;

public class Car {
    private String type;
    private int yearOfProduction;
    private float engineCapacity;

    public Car(String type, int yearOfProduction, float engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return  "-----------" +
                "\ntype: " + type  +
                "\nyear: " + yearOfProduction +
                "\nengine: " + engineCapacity +
                "\n";
    }
}
