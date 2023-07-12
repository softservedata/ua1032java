package homeWork_7_OOP_Part_2.task2;

public class Boat extends WaterVehicle{

   private int volume;



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

    @Override
    public void isSailing() {
        System.out.println("isSailing Boat");
    }
}
