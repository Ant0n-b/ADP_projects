public class Truck implements IVehicle {
    private int loadCapacity;
    private int axles;

    public Truck(int loadCapacity, int axles) {
        this.loadCapacity = loadCapacity;
        this.axles = axles;
    }

    @Override
    public void drive() {
        System.out.println("The truck with " + loadCapacity + " tons capacity and " + axles + " axles is driving.");
    }

    @Override
    public void refuel() {
        System.out.println("The truck is being refueled with diesel.");
    }
}