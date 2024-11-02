public class SugDec extends BevDec {
    public SugDec(IBev bev) {
        super(bev);
    }

    public double getCos() {
        return super.getCos() + 5.0;
    }

    public String getDes() {
        return super.getDes() + ", Sugar";
    }
}