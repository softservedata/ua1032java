package homework.lesson7.task2;

public abstract class WaterVehicle extends Passengers implements Vehicle{

    public WaterVehicle(int passengers) {
        super(passengers);
    }

    protected abstract void isSailing();

}
