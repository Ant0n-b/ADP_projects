public class PayAdapA implements IPayProc {
    private ExtPaySysA extSysA;

    public PayAdapA(ExtPaySysA extSysA) {
        this.extSysA = extSysA;
    }

    public void procPay(double amt) {
        extSysA.makePay(amt);
    }

    public void refPay(double amt) {
        extSysA.makeRef(amt);
    }
}