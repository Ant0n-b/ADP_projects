public class PayPalPro implements IPaymentProcessor {
    public void proPay(double amt) {
        System.out.println("Processing payment of " + amt + " KZT via PayPal.");
    }
}