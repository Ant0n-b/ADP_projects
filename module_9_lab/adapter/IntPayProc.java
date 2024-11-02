public class IntPayProc implements IPayProc {
    public void procPay(double amt) {
        System.out.println("Processing payment of " + amt + " via internal system.");
    }

    public void refPay(double amt) {
        System.out.println("Refunding payment of " + amt + " via internal system.");
    }
}