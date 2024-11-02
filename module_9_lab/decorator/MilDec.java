public class MilDec extends BevDec {
    public MilDec(IBev bev) {
        super(bev);
    }

    public double getCos() {
        return super.getCos() + 10.0;
    }

    public String getDes() {
        return super.getDes() + ", Milk";
    }
}