package homeWork_5_Arrays_Loops.HomeWork;

public class Car {
    private String  type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car() {
    }

    public Car(String type) {
        this.type = type;
    }

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (yearOfProduction != car.yearOfProduction) return false;
        if (Double.compare(car.engineCapacity, engineCapacity) != 0) return false;
        return type.equals(car.type);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = type.hashCode();
        result = 31 * result + yearOfProduction;
        temp = Double.doubleToLongBits(engineCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }




}
