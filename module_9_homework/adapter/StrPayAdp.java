public class StrPayAdp implements IPaymentProcessor {
    private StrPaySer strSer;

    public StrPayAdp(StrPaySer strSer) {
        this.strSer = strSer;
    }

    public void proPay(double amt) {
        strSer.makTra(amt);
    }
}