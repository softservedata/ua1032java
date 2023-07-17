package homeworkTaskTwo.water;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public Boat(int volume) {
        super();
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "volume=" + volume +
                '}';
    }

    @Override
    void isSailing() {
        System.out.println("The boat is sailing!");
    }
}
