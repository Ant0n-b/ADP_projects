public class TruckFactory extends VehicleFactory {
    @Override
    public IVehicle createVehicle(String... params) {
        return new Truck(Integer.parseInt(params[0]), Integer.parseInt(params[1])); // loadCapacity, axles
    }
}