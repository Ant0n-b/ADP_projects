class PlaneFactory extends TransportFactory {
    @Override
    public Transport createTransport(String model, int speed) {
        return new Plane(model, speed);
    }
}