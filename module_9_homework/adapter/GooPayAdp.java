public class GooPayAdp implements IPaymentProcessor {
    private GooPaySer gooSer;

    public GooPayAdp(GooPaySer gooSer) {
        this.gooSer = gooSer;
    }

    public void proPay(double amt) {
        gooSer.payAmt(amt);
    }
}