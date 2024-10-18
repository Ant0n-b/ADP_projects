import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TravelBookingContext bookingContext = new TravelBookingContext();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип транспорта: 1 - Самолет, 2 - Поезд, 3 - Автобус");
        int choice = scanner.nextInt();

        ICostCalculationStrategy strategy;
        switch (choice) {
            case 1:
                strategy = new PlaneTravelStrategy();
                break;
            case 2:
                strategy = new TrainTravelStrategy();
                break;
            case 3:
                strategy = new BusTravelStrategy();
                break;
            default:
                System.out.println("Неверный выбор.");
                return;
        }

        bookingContext.setCostCalculationStrategy(strategy);

        System.out.println("Введите расстояние (в км):");
        double distance = scanner.nextDouble();
        
        System.out.println("Введите количество пассажиров:");
        int passengers = scanner.nextInt();
        
        System.out.println("Введите класс обслуживания (эконом/бизнес):");
        String serviceClass = scanner.next();
        
        System.out.println("Есть ли скидка? (true/false):");
        boolean hasDiscount = scanner.nextBoolean();

        try {
            double cost = bookingContext.calculateTravelCost(distance, passengers, serviceClass, hasDiscount);
            System.out.printf("Стоимость поездки: %.2f%n", cost);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
