package homeworkTaskOne;

class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("It is not a flying bird.");
    }

    @Override
    public String getInfo() {
        return "Non-Flying Bird";
    }
}
