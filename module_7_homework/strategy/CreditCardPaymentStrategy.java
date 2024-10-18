public class CreditCardPaymentStrategy implements IPaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Оплата банковской картой на сумму: " + amount + " руб.");
    }
}