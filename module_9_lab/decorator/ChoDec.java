public class ChoDec extends BevDec {
    public ChoDec(IBev bev) {
        super(bev);
    }

    public double getCos() {
        return super.getCos() + 15.0;
    }

    public String getDes() {
        return super.getDes() + ", Chocolate";
    }
}