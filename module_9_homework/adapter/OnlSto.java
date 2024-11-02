public class OnlSto {
    public static void main(String[] args) {
        IPaymentProcessor payPalPro = new PayPalPro();
        payPalPro.proPay(250.0);

        IPaymentProcessor strPayPro = new StrPayAdp(new StrPaySer());
        strPayPro.proPay(300.0);

        IPaymentProcessor gooPayPro = new GooPayAdp(new GooPaySer());
        gooPayPro.proPay(150.0);
    }
}