public class Syr extends BevDec {
    public Syr(Beverage bev) { super(bev); }
    public String desc() { return bev.desc() + ", Syrup"; }
    public double cost() { return bev.cost() + 25.0; }
}