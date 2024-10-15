import java.util.Scanner;

public class TransportFactoryTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of transport (car, motorcycle, truck, bus):");
        String transportType = scanner.nextLine().toLowerCase();

        IVehicle vehicle = null;
        VehicleFactory factory = getFactory(transportType);

        if (factory != null) {
            String[] params = getVehicleParams(scanner, transportType);
            vehicle = factory.createVehicle(params);
            vehicle.drive();
            vehicle.refuel();
        } else {
            System.out.println("Unknown transport type.");
        }

        scanner.close();
    }

    // Метод для выбора фабрики на основе пользовательского ввода
    private static VehicleFactory getFactory(String transportType) {
        switch (transportType) {
            case "car":
                return new CarFactory();
            case "motorcycle":
                return new MotorcycleFactory();
            case "truck":
                return new TruckFactory();
            case "bus":
                return new BusFactory();
            default:
                return null;
        }
    }

    // Метод для получения параметров транспортного средства
    private static String[] getVehicleParams(Scanner scanner, String transportType) {
        switch (transportType) {
            case "car":
                System.out.println("Enter the brand, model, and fuel type:");
                return new String[] { scanner.nextLine(), scanner.nextLine(), scanner.nextLine() };
            case "motorcycle":
                System.out.println("Enter the type of motorcycle and engine capacity:");
                return new String[] { scanner.nextLine(), scanner.nextLine() };
            case "truck":
                System.out.println("Enter the load capacity (tons) and number of axles:");
                return new String[] { scanner.nextLine(), scanner.nextLine() };
            case "bus":
                System.out.println("Enter the passenger capacity and route:");
                return new String[] { scanner.nextLine(), scanner.nextLine() };
            default:
                return new String[] {};
        }
    }
}
