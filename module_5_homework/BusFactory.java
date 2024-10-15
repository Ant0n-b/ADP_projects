public class BusFactory extends VehicleFactory {
    @Override
    public IVehicle createVehicle(String... params) {
        return new Bus(Integer.parseInt(params[0]), params[1]); // passengerCapacity, route
    }
}