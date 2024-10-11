import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создаем товары
        Product product1 = new Product("Laptop", 1000, 1);
        Product product2 = new Product("Mouse", 50, 2);
        
        // Создаем скидку
        Discount discount = new Discount(100);

        // Создаем заказ
        Order originalOrder = new Order(Arrays.asList(product1, product2), 20, discount, "Credit Card");

        // Клонируем заказ
        Order clonedOrder = originalOrder.clone();

        // Изменяем клонированный заказ
        clonedOrder.clone().products.get(0).clone().name = "Tablet";

        // Выводим оригинальный и клонированный заказы
        System.out.println("Original Order: " + originalOrder);
        System.out.println("Cloned Order: " + clonedOrder);
    }
}
