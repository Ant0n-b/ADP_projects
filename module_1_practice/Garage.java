class Garage {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println(vehicle + " added to the garage.");
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
        System.out.println(vehicle + " removed from the garage.");
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    @Override
    public String toString() {
        return "Garage with " + vehicles.size() + " vehicle(s)";
    }
}