public class AdditionalTasks {
    public static void main(String[] args) {

    }
    // Task 1. You need to double the integer and return it.
    public static int doubleInteger(int i) {
       return i * 2;
    }

    // Task 2. Implement a function called multiply, which takes two numbers and returns their product.
    public static int multiply(int a, int b) {
        return a * b;
    }

    /*Task 3. Bob needs a fast way to calculate the volume of a cuboid with three values:
    the length, width and height of the cuboid. Write a function to help Bob with this calculation. */
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        double volume = length * width * height;
        return volume;
    }

    /*Jenny has written a function that returns a greeting for a user.
    However, she's in love with Johnny, and would like to greet him slightly different.
    She added a special case to her function, but she made a mistake. */
    public static String greet(String name) {
        if(name.equals("Johnny")){
            return "Hello, my love!";
        } else {
            return String.format("Hello, %s!", name);
        }
    }

    /* Clock shows h hours, m minutes and s seconds after midnight.
    Your task is to write a function which returns the time since midnight in milliseconds.*/
        public static int Past(int h, int m, int s) {
            return h * 360000 + m * 60000 + s * 1000;
        }

    /* Your friend is traveling abroad to the United States, so he wrote a program to convert fahrenheit to celsius.
    Unfortunately his code has some bugs.Find the errors in the code to get the celsius converter working properly.*/
    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c <= 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        double celsius = (temperature - 32) * (5.0 / 9.0);
        return celsius;
    }
}
