public class BankTransferPayment implements IPayment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer payment of " + amount);
    }
}