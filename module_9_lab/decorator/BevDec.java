public abstract class BevDec implements IBev {
    protected IBev bev;

    public BevDec(IBev bev) {
        this.bev = bev;
    }

    public double getCos() {
        return bev.getCos();
    }

    public String getDes() {
        return bev.getDes();
    }
}