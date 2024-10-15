public class VehicleManagementSystem {

    public static void main(String[] args) {
        // Создание транспортных средств
        Vehicle car1 = new Car("Toyota", "Camry", 2020, 4, "Automatic");
        Vehicle car2 = new Car("Honda", "Civic", 2018, 4, "Manual");
        Vehicle moto1 = new Motorcycle("Yamaha", "MT-07", 2019, "Sport", false);

        // Создание гаражей
        Garage garage1 = new Garage();
        Garage garage2 = new Garage();

        // Добавление транспортных средств в гаражи
        garage1.addVehicle(car1);
        garage1.addVehicle(moto1);
        garage2.addVehicle(car2);

        // Создание автопарка
        Fleet fleet = new Fleet();
        fleet.addGarage(garage1);
        fleet.addGarage(garage2);

        // Тестирование системы
        System.out.println("\nVehicles in Garage 1:");
        for (Vehicle v : garage1.getVehicles()) {
            System.out.println(v);
        }

        System.out.println("\nVehicles in Garage 2:");
        for (Vehicle v : garage2.getVehicles()) {
            System.out.println(v);
        }

        // Поиск транспортных средств по марке
        System.out.println("\nSearching for 'Toyota' vehicles in the fleet:");
        for (Vehicle v : fleet.searchVehicleByBrand("Toyota")) {
            System.out.println(v);
        }
    }
}