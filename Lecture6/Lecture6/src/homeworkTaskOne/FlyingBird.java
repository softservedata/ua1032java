package homeworkTaskOne;

class FlyingBird extends Bird {
    public FlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("It is a flying bird.");
    }

    @Override
    public String getInfo() {
        return "Flying Bird";
    }
}