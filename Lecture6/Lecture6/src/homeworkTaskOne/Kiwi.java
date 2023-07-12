package homeworkTaskOne;

class Kiwi extends NonFlyingBird {
    public Kiwi() {
        super("It has loose feathers that are more like fur and unlike other birds the feathers moult throughout the year. It is the only bird in the world with nostrils at the end of its beak. Its sense of smell is second to none.", "Lays Eggs");
    }

    @Override
    public String getInfo() {
        return "Kiwi";
    }
}
