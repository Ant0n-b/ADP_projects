public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Оплата банковской картой
        paymentContext.setPaymentStrategy(new CreditCardPaymentStrategy());
        paymentContext.executePayment(1000);

        // Оплата через PayPal
        paymentContext.setPaymentStrategy(new PayPalPaymentStrategy());
        paymentContext.executePayment(2000);

        // Оплата криптовалютой
        paymentContext.setPaymentStrategy(new CryptocurrencyPaymentStrategy());
        paymentContext.executePayment(1500);
    }
}