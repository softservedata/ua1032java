public class AddIitilonalTasks {

    public static int doubleInteger(int i) {
        return i * 2;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        double volume = length * width * height;
        return volume;
    }

    public static String greet(String name) {
        if (name.equals("Johnny")) {
            return "Hello, my love!";
        } else {
            return String.format("Hello, %s!", name);
        }
    }

    public static int Past(int h, int m, int s) {
        return h * 3600000 + m * 60000 + s * 1000;
    }

    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c > 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static int convertToCelsius(int temperature) {
        double celsius = (temperature - 32) + 5/9.0;
        return temperature;
    }

    public static void main(String[] args) {
        System.out.println(Past(0,1,1));
    }

}

