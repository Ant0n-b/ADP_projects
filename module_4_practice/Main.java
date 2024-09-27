public class Main {
    public static void main(String[] args) {
        // Создаем заказ
        Order order = new Order();
        order.addItem(new OrderItem("Laptop", 1000));
        order.addItem(new OrderItem("Mouse", 50));

        // Устанавливаем оплату
        order.setPayment(new CreditCardPayment());

        // Устанавливаем доставку
        order.setDelivery(new CourierDelivery());

        // Рассчитываем общую стоимость заказа с применением скидки
        DiscountCalculator discountCalculator = new DiscountCalculator(new PercentageDiscount(10));
        double totalPrice = order.calculateTotalPrice(discountCalculator);
        System.out.println("Total price with discount: " + totalPrice);

        // Обрабатываем заказ
        order.processOrder();

        // Уведомляем клиента
        INotification notification = new EmailNotification();
        notification.sendNotification("Your order has been processed!");
    }
}
