import java.util.Scanner;

public class TransportFactoryTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of transport (car, motorcycle, plane, bicycle):");
        String transportType = scanner.nextLine().toLowerCase();

        System.out.println("Enter the model of the transport:");
        String model = scanner.nextLine();

        System.out.println("Enter the speed of the transport (in km/h):");
        int speed = scanner.nextInt();

        // Создание фабрики на основе пользовательского ввода
        TransportFactory factory = getTransportFactory(transportType);
        if (factory != null) {
            Transport transport = factory.createTransport(model, speed);
            transport.move();
            transport.fuelUp();
        } else {
            System.out.println("Unknown transport type: " + transportType);
        }

        scanner.close();
    }

    // Метод для динамического выбора фабрики на основе типа транспортного средства
    private static TransportFactory getTransportFactory(String transportType) {
        switch (transportType) {
            case "car":
                return new CarFactory();
            case "motorcycle":
                return new MotorcycleFactory();
            case "plane":
                return new PlaneFactory();
            case "bicycle":
                return new BicycleFactory();
            default:
                return null;
        }
    }
}