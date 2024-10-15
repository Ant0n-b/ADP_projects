class Motorcycle implements Transport {
    private String model;
    private int speed;

    public Motorcycle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("The motorcycle " + model + " is moving at " + speed + " km/h.");
    }

    @Override
    public void fuelUp() {
        System.out.println("The motorcycle " + model + " is being fueled with gasoline.");
    }
}