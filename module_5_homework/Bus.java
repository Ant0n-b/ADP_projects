public class Bus implements IVehicle {
    private int passengerCapacity;
    private String route;

    public Bus(int passengerCapacity, String route) {
        this.passengerCapacity = passengerCapacity;
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("The bus with capacity of " + passengerCapacity + " passengers is driving on route " + route + ".");
    }

    @Override
    public void refuel() {
        System.out.println("The bus is being refueled with diesel.");
    }
}