public class Motorcycle implements IVehicle {
    private String type;
    private int engineCapacity;

    public Motorcycle(String type, int engineCapacity) {
        this.type = type;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void drive() {
        System.out.println("The " + type + " motorcycle with " + engineCapacity + "cc engine is riding.");
    }

    @Override
    public void refuel() {
        System.out.println("The motorcycle is being refueled with gasoline.");
    }
}