public class PayAdapB implements IPayProc {
    private ExtPaySysB extSysB;

    public PayAdapB(ExtPaySysB extSysB) {
        this.extSysB = extSysB;
    }

    public void procPay(double amt) {
        extSysB.sendPay(amt);
    }

    public void refPay(double amt) {
        extSysB.procRef(amt);
    }
}