public class PayPalPaymentStrategy implements IPaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Оплата через PayPal на сумму: " + amount + " руб.");
    }
}