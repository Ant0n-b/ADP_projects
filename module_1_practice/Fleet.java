class Fleet {
    private List<Garage> garages = new ArrayList<>();

    public void addGarage(Garage garage) {
        garages.add(garage);
        System.out.println("Garage added to the fleet.");
    }

    public void removeGarage(Garage garage) {
        garages.remove(garage);
        System.out.println("Garage removed from the fleet.");
    }

    public List<Garage> getGarages() {
        return garages;
    }

    // Поиск транспортных средств по марке
    public List<Vehicle> searchVehicleByBrand(String brand) {
        List<Vehicle> result = new ArrayList<>();
        for (Garage garage : garages) {
            for (Vehicle vehicle : garage.getVehicles()) {
                if (vehicle.getBrand().equalsIgnoreCase(brand)) {
                    result.add(vehicle);
                }
            }
        }
        return result;
    }
}