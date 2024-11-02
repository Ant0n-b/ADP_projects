public class ShopPaySys {
    public static void main(String[] args) {
        IPayProc intProc = new IntPayProc();
        intProc.procPay(100.0);
        intProc.refPay(50.0);

        ExtPaySysA extSysA = new ExtPaySysA();
        IPayProc adapA = new PayAdapA(extSysA);
        adapA.procPay(200.0);
        adapA.refPay(100.0);

        ExtPaySysB extSysB = new ExtPaySysB();
        IPayProc adapB = new PayAdapB(extSysB);
        adapB.procPay(300.0);
        adapB.refPay(150.0);
    }
}