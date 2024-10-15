class Plane implements Transport {
    private String model;
    private int speed;

    public Plane(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("The plane " + model + " is flying at " + speed + " km/h.");
    }

    @Override
    public void fuelUp() {
        System.out.println("The plane " + model + " is being fueled with aviation fuel.");
    }
}