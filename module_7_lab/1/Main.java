import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DeliveryContext deliveryContext = new DeliveryContext();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип доставки: 1 - Стандартная, 2 - Экспресс, 3 - Международная, 4 - Ночная");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                deliveryContext.setShippingStrategy(new StandardShippingStrategy());
                break;
            case "2":
                deliveryContext.setShippingStrategy(new ExpressShippingStrategy());
                break;
            case "3":
                deliveryContext.setShippingStrategy(new InternationalShippingStrategy());
                break;
            case "4":
                deliveryContext.setShippingStrategy(new NightShippingStrategy());
                break;
            default:
                System.out.println("Неверный выбор.");
                return;
        }

        System.out.println("Введите вес посылки (кг):");
        BigDecimal weight = getInput(scanner);

        System.out.println("Введите расстояние доставки (км):");
        BigDecimal distance = getInput(scanner);

        BigDecimal cost = deliveryContext.calculateCost(weight, distance);
        System.out.printf("Стоимость доставки: %s%n", cost);
    }

    private static BigDecimal getInput(Scanner scanner) {
        BigDecimal input = null;
        while (input == null) {
            try {
                input = new BigDecimal(scanner.nextLine());
                if (input.compareTo(BigDecimal.ZERO) < 0) {
                    throw new IllegalArgumentException();
                }
            } catch (Exception e) {
                System.out.println("Некорректный ввод. Повторите попытку.");
                input = null;
            }
        }
        return input;
    }
}
