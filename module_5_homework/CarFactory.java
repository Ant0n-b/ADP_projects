public class CarFactory extends VehicleFactory {
    @Override
    public IVehicle createVehicle(String... params) {
        return new Car(params[0], params[1], params[2]); // brand, model, fuelType
    }
}