class Car extends Vehicle {
    private int doors;
    private String transmission;

    public Car(String brand, String model, int year, int doors, String transmission) {
        super(brand, model, year);
        this.doors = doors;
        this.transmission = transmission;
    }

    public int getDoors() {
        return doors;
    }

    public String getTransmission() {
        return transmission;
    }

    @Override
    public String toString() {
        return super.toString() + ", Doors: " + doors + ", Transmission: " + transmission;
    }
}