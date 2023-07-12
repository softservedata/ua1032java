package hw07_P_2;

// Boat class represents a boat, which is a type of water vehicle
public class Boat extends WaterVehicle {
    int volume;

    public Boat(int volume) {
        this.volume = volume;
    }

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Method to indicate that the boat is sailing and the engine volume it has
    @Override
    public void isSailing() {
        super.isSailing();
        System.out.println(", namely on a boat. Engine volume: " + volume);
    }
}
