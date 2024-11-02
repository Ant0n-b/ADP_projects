public abstract class BevDec implements Bev {
    protected Beverage bev;
    public BevDec(Beverage bev) { this.bev = bev; }
    public String desc() { return bev.desc(); }
    public double cost() { return bev.cost(); }
}