public class CafOrder {
    public static void main(String[] args) {
        IBev bev = new Cof();
        System.out.println(bev.getDes() + " : " + bev.getCos());

        bev = new MilDec(bev);
        System.out.println(bev.getDes() + " : " + bev.getCos());

        bev = new SugDec(bev);
        System.out.println(bev.getDes() + " : " + bev.getCos());

        bev = new ChoDec(bev);
        System.out.println(bev.getDes() + " : " + bev.getCos());

        bev = new VanDec(bev);
        System.out.println(bev.getDes() + " : " + bev.getCos());

        bev = new CinDec(bev);
        System.out.println(bev.getDes() + " : " + bev.getCos());
    }
}