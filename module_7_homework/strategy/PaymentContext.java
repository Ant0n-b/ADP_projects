public class PaymentContext {
    private IPaymentStrategy paymentStrategy;

    public void setPaymentStrategy(IPaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void executePayment(int amount) {
        if (paymentStrategy == null) {
            System.out.println("Стратегия оплаты не установлена.");
            return;
        }
        paymentStrategy.pay(amount);
    }
}