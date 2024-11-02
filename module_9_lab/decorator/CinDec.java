public class CinDec extends BevDec {
    public CinDec(IBev bev) {
        super(bev);
    }

    public double getCos() {
        return super.getCos() + 8.0;
    }

    public String getDes() {
        return super.getDes() + ", Cinnamon";
    }
}