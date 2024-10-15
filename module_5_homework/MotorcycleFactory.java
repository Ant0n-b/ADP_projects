public class MotorcycleFactory extends VehicleFactory {
    @Override
    public IVehicle createVehicle(String... params) {
        return new Motorcycle(params[0], Integer.parseInt(params[1])); // type, engineCapacity
    }
}