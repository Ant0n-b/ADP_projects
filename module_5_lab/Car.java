class Car implements Transport {
    private String model;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("The car " + model + " is moving at " + speed + " km/h.");
    }

    @Override
    public void fuelUp() {
        System.out.println("The car " + model + " is being fueled with gasoline.");
    }
}