class Bicycle implements Transport {
    private String model;
    private int speed;

    public Bicycle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("The bicycle " + model + " is moving at " + speed + " km/h.");
    }

    @Override
    public void fuelUp() {
        System.out.println("The bicycle " + model + " doesn't need fuel, it's powered by human energy!");
    }
}