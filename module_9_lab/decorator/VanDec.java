public class VanDec extends BevDec {
    public VanDec(IBev bev) {
        super(bev);
    }

    public double getCos() {
        return super.getCos() + 12.0;
    }

    public String getDes() {
        return super.getDes() + ", Vanilla";
    }
}