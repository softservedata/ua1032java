package homeworkTaskOne;

class Penguin extends NonFlyingBird {
    public Penguin() {
        super("Penguins are flightless birds with flippers instead of wings. Their bodies are adapted for swimming and diving in the water, with some species able to reach speeds up to 15 miles per hour. ", "Lays Eggs");
    }

    @Override
    public String getInfo() {
        return "Penguin";
    }
}